package algorithms;

import java.lang.Math;
import java.util.Scanner;

public class uglyNumber {
    public static int find(int n) {
        int[] ugly = new int[n];
        int i2, i3, i5;
        i2 = i3 = i5 = 0;
        int next2 = 2;
        int next3 = 3;
        int next5 = 5;
        int next = 1;

        ugly[0] = 1;

        for(int i=1; i<n; i++) {
            System.out.print(next + " ");
            next = Math.min(next2, Math.min(next3, next5));
            ugly[i] = next;
            if(next == next2) {
                i2 = i2+1;
                next2 = ugly[i2]*2;
            }
            if(next == next3) {
                i3 = i3+1;
                next3 = ugly[i3]*3;
            }
            if(next == next5) {
                i5=i5+1;
                next5 = ugly[i5]*5;
            }
        }
        return next;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number : ");
        int n = Integer.parseInt(sc.next());
        System.out.println(find(n));
    }
}
