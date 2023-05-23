import java.util.Scanner;

public class java_5
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("The Sum of These numbers is");
        System.out.println(sum);
    }
}