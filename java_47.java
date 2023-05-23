// this and super keyword

class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a) {
        this.a = a; // "this" represents/refers to current object
    }

    public int returnone() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c); // if this is not present then error will be shown as default cons. is not
        // base class
        System.out.println("I am a constructor");
    }
}

public class java_47 {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
