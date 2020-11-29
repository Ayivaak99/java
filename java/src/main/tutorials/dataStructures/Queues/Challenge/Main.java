package main.tutorials.dataStructures.Queues.Challenge;

import java.util.LinkedList;

public class Main {
    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack= new LinkedList<>();
        String lowercase = string.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!queue.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String str1 = "I did, did I?";
        String str2 = "Racecar?";
        String str3 = "hello";
        String str4 = "Don't nod";
        String str5 = "COOLLOC";

        System.out.println(checkForPalindrome(str1));
        System.out.println(checkForPalindrome(str2));
        System.out.println(checkForPalindrome(str3));
        System.out.println(checkForPalindrome(str4));
        System.out.println(checkForPalindrome(str5));
    }
}
