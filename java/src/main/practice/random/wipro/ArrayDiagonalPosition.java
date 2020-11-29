package main.practice.random.wipro;

import java.util.ArrayList;
import java.util.List;

class Coords {
    int x;
    int y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean less(Coords coords) {
        return (this.x < coords.x) && (this.y < coords.y);
    }

    public boolean isNegative() {
        return (this.x < 0 || this.y < 0);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}

public class ArrayDiagonalPosition extends Coords{

    public ArrayDiagonalPosition(int x, int y) {
        super(x, y);
    }

    public static ArrayList<Coords> findCoords(char[][] matrix, int rows, int cols) {
        ArrayList<Coords> coordlist = new ArrayList<>();

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (matrix [i][j] == '+') {
                    coordlist.add(new Coords(i,j));
                }
            }
        }

        return coordlist;
    }

    public static Coords findOtherCoords(List<Coords> diagonal, Coords euclid) {

        return new Coords(diagonal.get(1).x + diagonal.get(0).x - euclid.x,
                diagonal.get(0).y + diagonal.get(1).y - euclid.y);
    }

    public static boolean fitsParallelogram(Coords coords, int rows, int cols) {
        return coords.less(new Coords(rows, cols)) && !coords.isNegative();
    }

    public static void addCoordsToMatrix(char[][] matrix, Coords coords) {
        matrix[coords.x][coords.y] = '+';
    }

    public static void main(String[] args) {

        int rows = 4, cols = 8;
        char[][] matrix = new char[][]{
                {'_', '_', '_', '_', '_', '_', '_', '_'},
                {'_', '+', '_', '_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_', '+', '_', '_'},
                {'_', '_', '_', '_', '_', '_', '_', '_'}
        };

        Coords euclid = new Coords(0,6);

        ArrayList<Coords> diagonal, coords;
        diagonal = findCoords(matrix, rows, cols);
        Coords monte = findOtherCoords(diagonal, euclid);

        if (fitsParallelogram(monte, rows, cols) && fitsParallelogram(euclid, rows, cols)) {
            System.out.println("Coordinate " + monte + " fits the parallelogram.");
            coords = new ArrayList<>(diagonal);
            coords.add(euclid);
            addCoordsToMatrix(matrix, euclid);
            coords.add(monte);
            addCoordsToMatrix(matrix, monte);

            for (Coords c: coords) {
                System.out.println(c);
            }

            for (char[] row: matrix) {
                for (char val: row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Coordinate " + monte + " does not fit the parallelogram.");
        }
    }
}
