// Anonymous Classes : a class without ant name, used when needed to use once

interface DemoAno {
    void meth1(int a);
}

class AnonyDemo implements DemoAno {
    @Override
    public void meth1(int a) {
        System.out.println("I am meth1");
    }
}

public class java_109 {
    public static void main(String[] args) {
        // -> Normal Method to implement meth1 of class
        // DemoAno obj = new AnonyDemo();
        // obj.meth1();

        // -> Anonymous Class
        // DemoAno obj = new DemoAno()
        // {
        // @Override
        // public void meth1()
        // {
        // System.out.println("I am meth1");
        // }
        // };
        // obj.meth1();

        // Lambda Expressions : Another way overwrite methods of a class which made from
        // interface

        // -> Traditional way
        // DemoAno obj = new HarryFunc();
        // obj.meth1();

        // -> Lambda Expression way
        DemoAno obj = (a) -> {
            System.out.println("I am method 1 from this lambda " + a);
        };
        obj.meth1(6);
    }
}
