package main.tutorials.dataStructures.Stacks.Challenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static boolean checkForPalindrome(String string) {
//        LinkedList<Character> stack1= new LinkedList<Character>();
//        LinkedList<Character> stack2= new LinkedList<Character>();
//
//        char[] characters = string.toLowerCase().replaceAll("[,?'\\s]+", "").strip().toCharArray();
//        for (char c: characters) {
//            stack1.push(c);
//        }
//
//        ListIterator<Character> iter1 = stack1.listIterator();
//        while (iter1.hasNext()) {
//            stack2.push(iter1.next());
//        }
//
//        return stack1.equals(stack2);

        // OR

        LinkedList<Character> stack= new LinkedList<Character>();
        StringBuilder build = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                build.append(c);
                stack.push(c);
            }
        }

        StringBuilder reverse = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        return reverse.toString().equals(build.toString());
    }
    public static void print(LinkedList<Character> stack) {
        ListIterator<Character> iter = stack.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    public static void main(String[] args) {
        String str1 = "I did, did I?";
        String str2 = "Racecar?";
        String str3 = "hello";
        String str4 = "Don't nod";

        System.out.println(checkForPalindrome(str1));
        System.out.println(checkForPalindrome(str2));
        System.out.println(checkForPalindrome(str3));
        System.out.println(checkForPalindrome(str4));
    }

}
