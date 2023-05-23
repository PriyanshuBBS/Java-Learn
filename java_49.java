// Dynamic Method Dispatch : Which method to run decied at runtime
class Phone {
    public void showTime() {
        System.out.println("Time is 8am");
    }

    public void on() {
        System.out.println("Turning on phone");

    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music");
    }

    public void on() {
        System.out.println("Turning on Smartphone");

    }
}

public class java_49 {
    public static void main(String[] args) {

        // Reference of Phone and Obj of SmartPhone
        // A Phone
        Phone obj = new SmartPhone();

        obj.showTime();
        obj.on();
        // obj.music(); Not allowed as Phone can't play music

        // whole thing is called Dynamic as it is object is created at runtime
    }
}
