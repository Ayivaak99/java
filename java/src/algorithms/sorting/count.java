package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class count {
    public static int [] sort(int [] input, int min, int max) {
        int[] countArray = new int[(max-min) + 1];
        for (int k : input) {
            countArray[k - min]++;
        }
        int j=0;
        for (int i=min; i<=max; i++) {
            while(countArray[i-min] > 0) {
                input[j++] = i;
                countArray[i-min]--;
            }
        }
        return input;
    }

//    public static int getMin(int[] array) {
//        int min = 0;
//        for(int i = 0; i<array.length; i++)
//            if(array[i] < min)
//                min = array[i];
//        return min;
//    }
//
//    public static int getMax(int[] array) {
//        int max = 0;
//        for(int i=0; i< array.length; i++)
//            if(array[i] > max)
//                max = array[i];
//        return max;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array: ");
        String numbers = sc.nextLine();

        int [] array = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int [] sortedArray = sort(array, 1, 10);

        for(int x: sortedArray)
            System.out.print(x + " ");
    }
}
