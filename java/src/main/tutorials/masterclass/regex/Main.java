package main.tutorials.masterclass.regex;

public class Main {
    public static void main(String[] args) {
//        String s = "I am a s";
//        System.out.println(s);
//        String x = s.replaceAll("s", "x");
//        System.out.println(x);

//        String alphanumeric = "abcDeeeeF12Ghhiiiijklabc999z";
//        System.out.println(alphanumeric);
//        System.out.println(alphanumeric.replaceAll(".", "ok"));
//        System.out.println(alphanumeric.replaceAll("abc", "XXX"));
//        System.out.println(alphanumeric.replaceAll("^abc", "XXX"));
//        System.out.println(alphanumeric.replaceAll("^abcDeeee", "XXX"));
//        System.out.println(alphanumeric.replaceAll("[aei]", "x"));
//        System.out.println(alphanumeric.replaceAll("[aei]", "x"));


        String regex = "^[A-Z]|[a-z]";
        String username = "kaaviya";

        System.out.println(username.replaceAll( "^[A-Za-z][A-Za-z0-9_]{7,29}$", "x"));
        System.out.println(username.matches(regex));

    }
}
