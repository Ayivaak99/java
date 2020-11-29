package main.string;

public class boolToString {
    public static boolean applyParse(String str) {
        System.out.print(str + ": ");
        return Boolean.parseBoolean(str);
    }

    public static boolean applyValue(String str) {
        System.out.print(str + ": ");
        return Boolean.valueOf(str);
    }

    public static void main(String[] args) {
        String str1 = "This will print false";
        String str2 = "true";
        System.out.println(applyParse(str1));
        System.out.println(applyValue(str2));

    }
}

