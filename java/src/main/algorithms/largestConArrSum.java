/* Efficient program to find the sum of contiguous sub array within a one-dimensional
* array of numbers which has the largest sum. */

package main.algorithms;

public class largestConArrSum {
    public static int find(int []array) {
        int size = array.length;
        int maxall = Integer.MIN_VALUE, maxnow = 0;

        for (int j : array) {
            maxnow = maxnow + j;
            if (maxall < maxnow)
                maxall = maxnow;
            if (maxnow < 0)
                maxnow = 0;
        }
        return maxall;
    }

    public static void main(String[] args) {
        int []array = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum contiguous sum is: "+
                find(array));
    }
}
