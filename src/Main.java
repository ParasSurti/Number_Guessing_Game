
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main
{
//    static int guess;
//    static int attempt;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("!! WELCOME TO NUMBER GUESSING GAME !!");
        System.out.println("You have 6 Attempt ");

        int target = RandomGenerator.getDefault().nextInt(101);
        int guess = 0;
        int attempt = 0;

        System.out.print("Select the Difficulty : ");
        String mode = input.next();

        Difficulty difficulty = new Difficulty();

        System.out.println("You Have Total " + difficulty.totalAttempt(mode) + " Attempt");
        System.out.println("Enter Your Guess (0 - 100) ");
        while(true)
        {
            guess = input.nextInt();
            attempt++;
            if(attempt == difficulty.totalAttempt(mode))
            {
                System.out.println("!! Game Over !! ");
                System.out.println("The Number was " + target);
                break;
            }
            if(guess == target)
            {
                System.out.println("Correct! You guessed the number!" );
                System.out.println("Total Attempt : " + attempt );
                break;
            }
            if(guess > target)
            {
                System.out.println("Too High! ");
                System.out.println("Attempt : " + attempt);
            }
            if(guess < target)
            {
                System.out.println("Too Low! ");
                System.out.println("Attempt : " + attempt);
            }
        }
    }
}
