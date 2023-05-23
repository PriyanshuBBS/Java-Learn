import java.util.*;

public class java_98 {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        // System.out.println("Current year is :"+ c.get(Calendar.YEAR));
        // System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        // System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
        // System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
        // System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        // System.out.println("Current second is :"+ c.get(Calendar.SECOND));
    
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone());
    }



}
