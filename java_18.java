// Switch
public class java_18 {
    public static void main(String[] args) {
        String var = "Saurabh";

        switch (var) {
            case "Shubham":
                System.out.println("Your are going to be Adult");
                break;
            case "Saurabh":
                System.out.println("You are going to get Job");
                break;
            case "Vishal":
                System.out.println("You are lame");
                break;
            default:
                System.out.println("Enjoy life");
                break;
        }

        // enhanced switch
        int age = 18;

        switch (age) {
            case 18 -> {
                System.out.print("Hello ");
                System.out.println("Mate");
            }
            case 20 -> System.out.println("You got Job");
            default -> System.out.println("Umjoy");
        }
    }
}
