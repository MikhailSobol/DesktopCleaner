package controller;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateController {

    public static String getCurrentDate() {
        final DateFormat dateFormat = new SimpleDateFormat("yy_MM_dd");
        final Date date = new Date();
        return dateFormat.format(date);
    }

}
