import java.util.Scanner;

public class java_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Physics");
        int physics = scan.nextInt();

        System.out.println("Enter English");
        int english = scan.nextInt();

        System.out.println("Enter Chemistry");
        int chem = scan.nextInt();

        System.out.println("Enter Mathematics");
        int math = scan.nextInt();

        System.out.println("Enter Computer Science");
        int cs = scan.nextInt();

        // Type Casting is happening
        float percentage = ((physics+english+chem+math+cs)/500.0f)*100;

        System.out.println("Percentage: ");
        System.out.println(percentage);
    }

}
