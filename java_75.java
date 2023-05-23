class MyNewThr1 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            // System.out.println("I am a thread");
            System.out.println("Thank you: ");
            
            // sleep(): it stops the execution for 455 mili seconds
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread {

    public void run() {
        while (true) {
            System.out.println("My Thank you: ");
        }
    }
}

public class java_75 {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // ** As t1 starts t2 too starts but if you have to
        // impletent t2 after t1 implemented join method is needed

        // t1.join(); --> will show error as it can throw an exception

        // Hence try and catch is used

//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();
    }
}
