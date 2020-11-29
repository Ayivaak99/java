package main.practice.random.wipro;

import java.util.Scanner;

public class DistinctLexicographical {
    static final int MAX = 26;
//    public static String smallAlgo(String s1, String s2) {
//        return s1.chars().distinct().mapToObj(ch -> String.valueOf((char)ch)).filter(s2::contains).collect(Collectors.joining());
//    }

    public static String bigAlgo(String s1, String s2) {
        int[] a1 = new int[MAX];
        int[] a2 = new int[MAX];
        int l1 = s1.length();
        int l2 = s2.length();
        StringBuilder result = new StringBuilder();

        for (int i=0; i<l1; i++) {
            a1[s1.charAt(i) - 'a']++;
        }
        for (int i=0; i<l2; i++) {
            a2[s2.charAt(i) - 'a']++;
        }
        for (int i=0; i<MAX; i++) {
            if (a1[i] != 0 && a2[i] != 0) {
//                for (int j < Math.min(a1[i], a2[i]); j++) uncomment to find even duplicate common characters
                    result.append((char) (i + 'a'));
            }
        }
        return result.toString();
    }

    public static String removeSpace(String string) {
        char[] chars = string.toCharArray();
        StringBuilder buffer = new StringBuilder();

        for (char c : chars) {
            if (c != ' ' && c != '\t') {
                buffer.append(c);
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String name1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second string : ");
        String name2 = sc.nextLine().toLowerCase();

        String x = bigAlgo(removeSpace(name1), removeSpace(name2));
        System.out.println("Unique characters : " + x);


    }
}
