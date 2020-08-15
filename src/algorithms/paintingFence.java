package algorithms;
import java.util.*;

public class paintingFence {
    public static long count(int posts, int colors) {
             long []dp = new long[posts+1];
             int mod = (int) (Math.pow(10,9) + 7);
             Arrays.fill(dp,0);
             int same=0, diff=colors;
             dp[1] = same+diff;
             for(int i=2; i<=posts; i++) {
                 same = diff;
                 diff = (int) (dp[i-1] * (colors-1));
                 dp[i] = (same+diff) % mod;
             }
             return  dp[posts];
    }

    public static void main(String[] args) {
        int posts=2, color=4;
        System.out.println(count(posts,color));
    }
}
