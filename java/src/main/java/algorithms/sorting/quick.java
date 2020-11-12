package main.java.algorithms.sorting;
import java.util.*;
/*
Quick sort is a divide and conquer algorithm. It picks an element
as pivot and partitions the given array around the picked pivot
The time taken by QuickSort depends upon the input array
and partition strategy.
 */

public class quick {
    public static int partition(int [] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for (int j=low; j<high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }
    public static void sort(int [] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array : ");
        String numbers = sc.nextLine();
        int [] array = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        sort(array, 0, array.length-1);

        for(int x: array)
            System.out.print(x + " ");
    }
}
