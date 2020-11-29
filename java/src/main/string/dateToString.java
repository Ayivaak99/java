package main.string;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class dateToString {
    public static  String convert(String date) {
        DateFormat df = new SimpleDateFormat(date);
//        System.out.print(df);
        Date today = Calendar.getInstance().getTime();
        System.out.println(today);
        return df.format(today);
    }

    public static void main(String[] args) {
        String date = "07-07-2020";
        System.out.println(convert(date));
    }
}
