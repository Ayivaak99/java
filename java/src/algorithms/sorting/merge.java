package algorithms.sorting;
import java.util.*;

/*
Merge sort is a divide and conquer algorithm. It divides
input array in two halves, calls itself for the two halves
and then merges the two sorted halves.
 */

public class merge {
    public static void combine(int [] array, int left, int middle,
                             int right) {
        int n1 = middle+1-left;
        int n2 = right - middle;
        int [] l = new int[n1];
        int [] r = new int[n2];

        //noinspection ManualArrayCopy
        for (int i=0; i<n1; i++)
            l[i] = array[left+i];
        for(int j=0; j<n2; j++)
            r[j] = array[middle+1+j];

        int i=0, j=0, k=1;
        while (i<n1 && j<n2) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            }
            else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            array[k] = l[i];
            i++;
            k++;
        }while (j<n2) {
            array[k] = r[j];
            j++;
            k++;
        }
    }

    public static void sort(int [] array, int left, int right) {
        if(left<right) {
            int middle = (left + right)/2;
            sort(array, left, middle);
            sort(array, middle+1, right);
            combine(array, left, middle, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array : ");
        String numbers = sc.nextLine();
        int [] array = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int left=0, right = array.length-1;
        sort(array, left, right);

        for(int x:array)
            System.out.print(x);
    }
}
