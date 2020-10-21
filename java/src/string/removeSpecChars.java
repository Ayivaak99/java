package string;

public class removeSpecChars {
    public static String apply(String str) {
        return str.replaceAll("[^a-zA-z0-9 ]", "");
    }

    public static String applyASCII(String str) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch<=122)
                    || (ch==32))
                res.append(ch);
//            System.out.println();
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "This function will remove all Sp#e&c.i*al characters!";
        System.out.println(str);
        System.out.println(applyASCII(str));
        System.out.println(apply(str));
    }
}
