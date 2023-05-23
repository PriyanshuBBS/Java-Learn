import java.util.Calendar;
// import java.util.GregorianCalendar; God knows why it is not running in this pc
import java.util.TimeZone;

public class java_99 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        
        
        // GregorianCalendar cal = new GregorianCalendar();
        // System.out.println(cal.isLeapYear(2018));

        // Prints the timezones with ids
        System.out.println(TimeZone.getAvailableIDs()[69]);
        System.out.println(TimeZone.getAvailableIDs()[36]);
        System.out.println(TimeZone.getAvailableIDs()[88]);
    }
}
