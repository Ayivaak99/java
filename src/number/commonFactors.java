package number;

import java.util.Arrays;
import java.util.Scanner;
public class commonFactors {
    public static int GCD(int a, int b) {
        if(a==0) return b;
        return GCD(b%a, a);
    }

    public static int find(int[] array) {
        int a = array[0];
        int b = array[1];

        int result=0;
        int gcd = GCD(a,b);

        for(int i=1; i < (int)(Math.sqrt(gcd) + 1); i++) {
            if(gcd%i==0) {
                if(gcd/i == 1)
                    result++;
                else
                    result+=2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        String numbers = sc.nextLine();

        int[] intArray = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intArray);

        System.out.println(find(intArray));
    }
}
