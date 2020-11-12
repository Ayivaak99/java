/* Given a string, print the longest repeating subsequence such
* that the two subsequence don’t have same string character at
* same position, i.e., any i’th character in the two subsequences
* shouldn’t have the same index in the original string. */

package main.java.algorithms;

import java.util.Arrays;

public class longestRepSubseq {
    public static String apply(String str) {
        int n = str.length();
        int [][]dp = new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i], 0);
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (str.charAt(i-1) == str.charAt(j-1) & i!=j)
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        StringBuilder res = new StringBuilder();
        int i=n, j=n;
        while (i>0 && j>0) {
            if (dp[i][j] == dp[i-1][j-1] + 1) {
                res.append(str.charAt(i - 1));
                i--;
                j--;
            }
            else if (dp[i][j] == dp[i-1][j])
                i--;
            else
                j--;
        }
        StringBuilder reverse = new StringBuilder();
        for (int k=res.length()-1; k>=0; k--) {
            reverse.append(res.charAt(k));
        }

        return reverse.toString();
    }

    public static void main(String[] args) {
        String str = "AAABBTTEE";
        System.out.println(apply(str));
    }
}
