/*
 * MIN_PRIORITY: Minimum priority that a thread can have. Value is 1.
NORM_PRIORITY: This is the default priority automatically assigned by JVM to a thread if a programmer 
does not explicitly set the priority of that thread. Value is 5.
MAX_PRIORITY: Maximum priority that a thread can have. Value is 10.
 */


class MyThr extends Thread {

    // Constructor of Thread
    // Naming the thread
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thank you");
    }

}

public class java_73 {
    public static void main(String[] args) {
        // Naming threads
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Rishabh");
        
      
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

        t1.start();
        t2.start();
        

    }
}

// -> Thread group : putting threads doing same work in a group

