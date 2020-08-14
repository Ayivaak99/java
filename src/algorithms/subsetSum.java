package algorithms;

public class subsetSum {
    public static boolean recursive(int []set, int n, int sum) {
        if (sum==0)
            return true;
        if (n==0 && sum!=0)
            return  false;
        if(set[n-1] > sum)
            return recursive(set, n-1, sum);
        return recursive(set, n-1, sum) ||
            recursive(set, n-1, sum-set[n-1]);
    }

    public static void main(String[] args) {
        int []set = {4,6,7,3,1,2,2,7,6};
        int sum = 378;
        int n = set.length;
        long startTime = System.currentTimeMillis();

        if (recursive(set,n,sum))
            System.out.println("Found!");
        else
            System.out.println("Not found!");

        long endTime = System.currentTimeMillis();
        System.out.println("Function took " + (endTime - startTime) + " milliseconds.");
    }
}
