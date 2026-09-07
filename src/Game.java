
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("!! WELCOME TO NUMBER GUESSING GAME !!");

        int target = RandomGenerator.getDefault().nextInt(101);

        System.out.print("Select the Difficulty : ");
        String mode = input.next();

        Difficulty difficulty = new Difficulty();
        int totalAttempts = difficulty.totalAttempt(mode);


        System.out.println("You Have Total " + totalAttempts + " Attempt");
        System.out.println("Enter Your Guess (0 - 100) ");
        Attempts attempts = new Attempts(target, totalAttempts);

    }
}
