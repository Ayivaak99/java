/* Binomial Coefficient (n,k) also gives number of ways, irrespective of
* order, that k objects can be chosen from  among n objects, more
* formally the number of k-element subsets of an element subset. */

package main.algorithms;

public class binomailCoeff {
    public static int recursive(int n, int k) {
        if (k==0 || k==n) {
            return 1;
        }

        return recursive(n-1, k-1) + recursive(n-1, k);
    }

    public static void main(String[] args) {
        int n=5, k=3;
        long startTime = System.currentTimeMillis();

        System.out.printf("Value of C(%d, %d) = %d\n",
                n, k, recursive(n,k));

        long endTime = System.currentTimeMillis();
        System.out.println("Function took " + (endTime - startTime) + " milliseconds.");
    }
}
