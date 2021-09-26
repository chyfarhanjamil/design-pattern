package com.company;
import java.util.Calendar;

public class Time {
    public int dd, mm, yyyy, hh, min;

    public Time(String t){
        Calendar calendar = Calendar.getInstance();
        String[] str = t.split(","); //[0] -> date, [1] -> time
        str = str[1].split(":");

        yyyy = calendar.get(Calendar.YEAR);
        mm = calendar.get(Calendar.MONTH) + 1;
        dd = calendar.get(Calendar.DATE);
        hh = Integer.parseInt(str[0].trim());
        min = Integer.parseInt(str[1].trim());

    }

    public String timeFormat24hrs(){
        return dd + "/" + mm + "/" + yyyy + ", " + hh + ':' + min;
    }

    public String timeFormat12hrs(){
        String format = dd + "/" + mm + "/" + yyyy + ", ";

        if(hh < 12) format += hh + ":" + min + " AM";
        else format += (hh - 12) + ":" + min + " PM";

        return format;
    }
}
