import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int NoOfGuesses = 0;

    Game()
    {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput()
    {
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber()
    {
        NoOfGuesses++;

        if(inputNumber == number){
            System.out.format("Yes you guessed it right,sed it right, it was %d\nYou guessed it in %d attempts", number, NoOfGuesses);
        }

        else if(inputNumber < number)
        {
            System.out.println("Too low...");
        }

        else if(inputNumber > number)
        {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class java_50 {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

         Game g = new Game();
         boolean b = false;

         while(!b)
         {
             g.takeUserInput();
             b = g.isCorrectNumber();
         }
    }
}
