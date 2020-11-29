package main.algorithms.sorting;
import java.util.*;
/*
Selection sort algorithm sorts an array by repeatedly finding
the minimum element from unsorted part and put it in the
beginning.
*/

public class selection {
    public static int [] sort(int[] array) {
        int n = array.length, min, temp;

        for(int i=0; i<n-1; i++) {
             min = i;
             for(int j=i+1; j<n; j++) {
                 if(array[j] < array[min])
                     min = j;
             }
             temp = array[min];
             array[min] = array[i];
             array[i] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array : ");
        String numbers = sc.nextLine();

        int[] array = Arrays.stream(numbers.split(" "))
                 .mapToInt(Integer::parseInt).toArray();
         int[] sortedArray = sort(array);

         for(int x:sortedArray) {
             System.out.print(x + " ");
         }
    }
}
