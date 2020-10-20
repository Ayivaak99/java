package algorithms.sorting;
import java.util.*;
/*
Insertion sort picks values from the unsorted part and
places at the correct position in the sorted part. Iterates
from [1] to [n], compares the current element to its
predecessor.
 */
public class insertion {
    public static int [] sort(int[] array) {
        int n = array.length, key;
        for(int i=1; i<n; i++) {
            key = array[i];
            int j=i-1;

            while(j>=0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
        return  array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array : " );

        String numbers = sc.nextLine();
        int[] array = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] sortedArray = sort(array);

        for(int x:sortedArray)
            System.out.print(x + " ");
    }
}
