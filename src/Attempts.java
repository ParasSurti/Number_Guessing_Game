import java.util.Scanner;

public class Attempts
{
    public Attempts(int target, int totalAttempt)
    {
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        while(true)
        {
            int guess = input.nextInt();
            attempts++;
            if(guess == target)
            {
                System.out.println("Correct! You guessed the number!" );
                System.out.println("Total Attempt : " + attempts );
                break;
            }
            if(attempts == totalAttempt)
            {
                System.out.println("!! Game Over !! ");
                System.out.println("You Have Used all the Attempts !! ");
                System.out.println("The Number was " + target);
                break;
            }
            if(guess > target) System.out.println("Too High! ");
            else System.out.println("Too low! ");
            System.out.println("Your Total Attempts : " + attempts);

        }
    }
}