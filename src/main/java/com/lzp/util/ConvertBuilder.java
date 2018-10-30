package com.lzp.util;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertBuilder {

    /**
     * String转为date
     * @param stringDate    yyyy-mm-dd
     * @return
     */
    static public Date stringToDate(String stringDate){
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date sresultDate = null;
        try {
            sresultDate = sdf2.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  sresultDate;
    }

    /**
     * 时间转为String
     * @param date
     * @return
     */
    static public String dateToString(Date date){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = format.format(date);
        return strDate;

    }
}
