package main.java.tutorials.dataStructures.Sort;

public class SelectionSort {
    public static void apply(int[] array) {
        int i,j ,max, index, temp;
        int n = array.length;

        for(i=0; i<n-1; i++) {
            max = i;
            for(j=i+1; j<n-i-1; j++) {
                if(array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            temp = array[j];
            array[j] = array[n-1];
            array[n-1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
    }
}
