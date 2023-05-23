// A derived class of an abstract class must be abstract 
// class or it should override all abstract method

// Abstract method like hey ye lo jo karna hai kar iss method
// ke sath (like providing standard for example : phone of samsung mi have call feature but diff impl.)

// object of abstract class can't be made

abstract class Parent2 {
    public Parent2() {
        System.out.println("Mai base2 ka constructor hoon");
    }
    abstract public void greet();
    abstract public void greet2();

}

// Since all methods are overridden not abstract class needed
// If not all methods are not overrriden then class will be needed to be abstract
class Child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

// Since all methods are not overrriden class needed to be abstract
abstract class Child3 extends Parent2 
{
    public void th() {
        System.out.println("I am good");
    }
}

public class java_53 {
    public static void main(String[] args) {
        // Parent2 p = new Parent2(); -- error objects of abstract class can't be made
        Child2 c = new Child2();
        // Child3 c3 = new Child3(); -- error
    }
}
