/* Given two sequences, find the length of longest subsequence present in both
*   of them. A subsequence is a sequence that appears in the same relative order,
*   but not necessarily contiguous. */

package algorithms;
import java.lang.Math;
import java.util.Arrays;

public class longestComSubseq {
    public static void find(String X, String Y, int m, int n) {
        int[][] L = new int[m+1][n+1];
        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        int index = L[m][n];
        char[] lcs = new char[index];
        int i=m, j=n;

        while(i>0 && j>0) {
            if (X.charAt(i-1) == Y.charAt(j-1)) {
                lcs[index-1] = X.charAt(i-1);
                i--;
                j--;
                index--;
            }
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }

        System.out.println("LCS of " + X + " and " + Y + ": " + Arrays.toString(lcs));
    }

    public static void main(String[] args) {
        String x = "ayivaak";
        String y = "kaaviya";

        int m = x.length();
        int n = y.length();
        long startTime = System.currentTimeMillis();
        find(x,y,m,n);
        long endTime = System.currentTimeMillis();
        System.out.println("Function took " + (endTime - startTime)
                + " milliseconds.");
    }
}
