// Variable arguments

public class java_33 {
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    // Here it is fixed that single argument will be passed
    static int sum(int x, int... arr) {
        int result = x;
        return result;
    }

    // L 34 : Recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(4, 5, 6));
    }
}
