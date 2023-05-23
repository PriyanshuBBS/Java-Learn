import java.util.Scanner;
public class test{
    public static void main(String[] args) {
          //Problem 3
          String letter = "Dear name, Thanks a lot!";
          Scanner sc = new Scanner(System.in);
          String name = sc.next();
          letter = letter.replace("name","Sachin");
          System.out.println(letter);
    }
}