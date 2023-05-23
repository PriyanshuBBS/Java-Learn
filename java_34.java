public class java_34 {

    // Sum of Fibonacci Numbers
    static int fib(int n) {
        /*
         * if(n==1){
         * return 0;
         * }
         * else if(n==2){
         * return 1;
         * }
         */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Problem 4
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // int result = fib(7);
        // System.out.println(result);

        pattern1_rec(4);
    }
}
