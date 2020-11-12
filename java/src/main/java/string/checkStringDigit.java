package main.java.string;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkStringDigit {
    static boolean flag = false;

    public static boolean applyIf(String str) {
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            flag = ch >= '0' && ch < '9';
        }
        return flag;
    }

    public static boolean applyFunc(String str) {
        for (int i=0; i<str.length(); i++) {
            flag = Character.isDigit(str.charAt(i));
        }
        return flag;
    }

    public static boolean applyRegex(String str) {
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m =p.matcher(str);

        return m.matches();
    }
    public static void main(String[] args) {
        String str1 = "345678";
        String str2 = "This string is made up of digits.";
        String str3 = "007JamesBond";
        System.out.println(str1 + ": " + applyIf(str1));
        System.out.println(str2 + ": " + applyFunc(str2));
        System.out.println(str3 + ": " + applyRegex(str3));
    }
}
