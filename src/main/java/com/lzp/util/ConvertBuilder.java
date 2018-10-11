package com.lzp.util;

import java.sql.Date;
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
        java.sql.Date sresultDate = null;
        try {
            java.util.Date date3 = sdf2.parse(stringDate);
            sresultDate = new java.sql.Date(date3.getTime());
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
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = format.format(date);
        return strDate;

    }
}
