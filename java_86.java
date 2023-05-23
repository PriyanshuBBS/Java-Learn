// 2. Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
// 3. Write a program that allows you to given. If max retries exceed 5 print "errors".

import java.util.Scanner;

public class java_86 {
    public static void main(String[] args) {
        // Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                // Whenever exception arrives chances of no of chances reduces
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
