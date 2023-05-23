// Thread using runnable interface

class MyThreadRunnable1 implements Runnable 
{
    public void run () {
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
    }
}

class MyThreadRunnable2 implements Runnable 
{
    public void run () {
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
    }
}

public class java_71 
{
    public static void main(String[] args) {

        // Both gun and Bullet needed to be used combined
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);  // Making threads

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        // Start can't be used seperately
        gun1.start();
        gun2.start();
    }

}
