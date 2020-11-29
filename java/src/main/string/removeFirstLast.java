package main.string;

public class removeFirstLast {
    public static String apply(String str) {
        return str.substring(1, str.length()-1);
    }

    public static void main(String[] args) {
        String str = "Remove first and last characters from the string";
        System.out.println(apply(str));
    }
}
