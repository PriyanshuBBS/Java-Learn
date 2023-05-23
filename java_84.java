// Creating a custom Exception
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class java_84 {

    // A Function is made, it have a warning that Exception can arise
    // Better be prepare/access the function in try-catch block
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }


    // Made By Priyanshu, but Chimtu wants to disgrace his coding skills by intentionally
    // throwing exception and saying see his function is bad
    // But Priyanshu warns the user by saying his function can throw exception so 
    // prepare with try-catch block

    public static int divide(int a, int b) throws ArithmeticException{
        
        int result = a/b;
        return result;
    }


    public static void main(String[] args)
    
    // All the statements that use the function having throws keyword
    // must/should be in try and catch blocks
    
    {
        // Shivam - uses divide function created by Harry
        try{
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
