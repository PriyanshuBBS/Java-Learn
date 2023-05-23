public class java_79 {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;


        // Without Try:
    //    int c = a / b;
    //    System.out.println("The result is " + c);
        
    
    // With Try:
        try { // It will try to run the code if fails then
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {  // Executes the this catch statements
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
