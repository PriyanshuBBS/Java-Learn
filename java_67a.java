package calc;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Result is " + a + b);
    }
}

class ScCalculator {
    public void calculate(int a, int b)
    {
        System.out.println("Result is "+Math.sin(a+b));
    }
}

class HyCalculator {
    public void calculate(int a, int b)
    {
        System.out.println("Result is "+a+b);
        System.out.println("Result is "+Math.sin(a+b));
    }
}

public class java_67a {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
