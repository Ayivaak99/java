package main.java.string;

public class padding {
    public static String applyLeft(String str, char ch, int n) {
        StringBuilder res = new StringBuilder(String.format("%" + n + "s", str));
        for (int i = 0; i<(n-str.length()); i++) {
            res.replace(i, i+1, String.valueOf(ch));
        }
        return res.toString();
    }

    public static String applyRight(String str, char ch, int n) {
        StringBuilder res = new StringBuilder(String.format("%" + (-n) + "s", str));
        for (int i = str.length(); i<n; i++) {
            res.replace(i, i+1, String.valueOf(ch));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "This is padding.";
        int n = 30;
        char ch = '@';
        System.out.println(applyLeft(str,ch, n));
        System.out.println(applyRight(str,ch, n));
    }
}
