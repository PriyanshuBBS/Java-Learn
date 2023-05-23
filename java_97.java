import java.util.Date;
public class java_97 {
    public static void main(String[] args) {

        //Question: can long store milli seconds from 1 Jan 1970
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis()); // miliseconds passed from 1 Jan 1970

        Date d = new Date();
        System.out.println(d);
        
        System.out.println(d.getTime()); // Time passed from 1970
        System.out.println(d.getDate()); //Today's Date
        System.out.println(d.getSeconds()); //Current Second
        System.out.println(d.getYear()); // Years passsed from 1900
    }
}
