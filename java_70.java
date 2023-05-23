// Sometimes it cooks and sometime it chats

// ** Implementing Threading using extends/inheritance
class MyThread1 extends Thread {
    // Run method is syntax
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Cooks");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Chats");
            i++;
        }
    }
}

public class java_70 {
    public static void main(String[] args) {

        // 2 Threads(tasks) are created
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // Start used to inititalite methods in threading (it implicit calls run)
        t1.start();
        t2.start();
    }
}
