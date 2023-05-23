import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class java_83 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a<9){
            // throw can be used as seperate but it is recommended to bound in brackets
            try
            {
              
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // will also print the toString
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
