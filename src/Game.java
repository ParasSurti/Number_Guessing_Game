import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Game
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("!! WELCOME TO NUMBER GUESSING GAME !!");
            int target = RandomGenerator.getDefault().nextInt(101);

            int totalAttempts = 0;
            Difficulty difficulty = new Difficulty();
            while(true)
            {
                System.out.print("Select the Difficulty : ");
                String mode = input.next();
                totalAttempts = difficulty.totalAttempt(mode);
                if(totalAttempts != 0 )
                {
                    break;
                }
            }
            System.out.println("You Have Total " + totalAttempts + " Attempt");
            System.out.println("Enter Your Guess (0 - 100) ");
            Attempts attempts = new Attempts(target, totalAttempts);

            System.out.print("Do You Wanna Play Again (Y/N) :");
            String ch = input.next();
            if(ch.equalsIgnoreCase("N"))
            {
                System.out.println("You have successfully exited the game");
                break;
            }
        }
    }
}
