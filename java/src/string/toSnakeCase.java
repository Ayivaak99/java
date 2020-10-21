package string;

public class toSnakeCase {
    public static String apply(String str) {
        StringBuilder res = new StringBuilder();
        res.append(Character.toLowerCase(
                str.charAt(0)));
        for(int i=1; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                res.append(Character.toLowerCase(ch));
            }
            else {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "This shall print out SnakeCase";
        System.out.println(str);
        System.out.println("Result: " + apply(str));
    }
}
