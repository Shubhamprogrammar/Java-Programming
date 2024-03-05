// Calendar class

import java.util.Calendar;
import java.util.TimeZone;

public class Timezone {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getTimeZone().getID());
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println("Zone offset"+": "+cal.get(Calendar.ZONE_OFFSET)/(60*60*1000));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cal2.getCalendarType());
        System.out.println(cal2.getTimeZone());
        System.out.println(cal2.getTimeZone().getID());
        System.out.println(cal2.get(10));
        System.out.println(cal2.getActualMaximum(10));
        System.out.println(cal2.getActualMinimum(10));
        System.out.println(Calendar.getInstance());
    }
}
