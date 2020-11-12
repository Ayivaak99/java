package main.java.algorithms;

public class permutationCoeff {
    public static int find(int n, int k) {
        int []fact = new int[n+1];
        fact[0] = 1;
        for (int i=1; i<=n; i++) {
            fact[i] = i*fact[i-1];
        }
        return fact[n]/fact[n-k];
    }

    public static void main(String[] args) {
        int n=5, k=3;
        long startTime = System.currentTimeMillis();
        System.out.printf("Value of P(%d, %d) = %d\n",
                n, k, find(n,k));

        long endTime = System.currentTimeMillis();
        System.out.println("Function took " + (endTime - startTime) + " milliseconds.");
    }
}
