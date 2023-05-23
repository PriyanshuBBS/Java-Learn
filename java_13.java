import java.util.Scanner;

public class java_13 {
    public static void main(String[] args) {
        String name = new String("Priyanshu");
        System.out.println(name);

        String surname = "Dhal";
        System.out.println(surname);

        int a = 6;
        float b = 9.67f;
        // %d are called format specifiers
        System.out.printf("The value of a is %d and b is %8.2f", a, b);
        // System.out.format(); works as same as above
        // %8.2 means 8 spaces with 2 precision || %.2f with 2 precision

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        // nextLine for whole line read
        System.out.println(st + " Railways");
    }

}
