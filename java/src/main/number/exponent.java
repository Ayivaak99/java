package main.number;

import java.util.Scanner;

public class exponent {
    public static int binaryExponentiation(int x, int n){
        if (n==0) return 1;
        else if(n%2 == 0) return binaryExponentiation(x*x, n/2);
        else return x*binaryExponentiation(x*x, (n-1)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int x = sc.nextInt();
        System.out.print("Enter exponent: ");
        int n = sc.nextInt();
        System.out.println(binaryExponentiation(x, n));
    }
}
