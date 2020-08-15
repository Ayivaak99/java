/* Given two integers m & n, find the number of possible sequences of length n such that each of the next element
* is greater than or equal to twice of the previous element but less than or equal to m. */

package algorithms;

public class possibleSeq {
    public static int find(int max, int n) {
        if(max < n){
            return 0;
        }
        if(n==0) {
            return 1;
        }
        return find(max-1, n) + find(max/2, n-1);
    }

    public static void main(String[] args) {
        int max=5;
        int n=2;
        System.out.println(find(max,n));
    }
}
