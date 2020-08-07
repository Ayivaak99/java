package string;

public class toCamelCase {
    toCamelCase() {}

    public static String applySB(String str) {
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        StringBuilder builder = new StringBuilder(str);
        for(int i=0; i<builder.length(); i++) {
            if(builder.charAt(i) == ' ') {
                builder.replace(i, i+1,
                        String.valueOf(
                                Character.toUpperCase(
                                        builder.charAt(i+1))));
            }
        }
        return builder.toString();
    }

    public static String applyReplaceFirst(String str) {
        str = str.substring(0,1).toUpperCase() + str.substring(1);
//        System.out.println(String.valueOf(new char[] ' ', str));
        while(str.contains(" ")) {
            str = str.replaceFirst(
                    " [a-z]", String.valueOf(
                            Character.toUpperCase(
                                    str.charAt(
                                            str.indexOf(" ")+1))));
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "this string is in camel case now";
        System.out.println(applySB(str));
        System.out.println(applyReplaceFirst(str));
    }
}
