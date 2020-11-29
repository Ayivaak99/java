package main.algorithms.sorting;

import java.util.Scanner;
import  java.util.Arrays;

public class bubble {
    public static int [] sort(int [] a) {
            int temp;
            int n = a.length;
            for (int k=0; k<n-1; k++) {
                for (int i=0; i<n-k-1; i++) {
                    if(a[i] > a[i+1]) {
                        temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                    }
                }
            }
            return a;
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array: ");
        String numbers = sc.nextLine();
        int [] array = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int [] sortedArray = sort(array);

        for(int x: sortedArray)
            System.out.print(x + " ");
    }
}
