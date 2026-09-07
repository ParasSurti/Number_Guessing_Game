import java.util.Scanner;

public class Attempts
{
    public void play(int target, int totalAttempt)
    {
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        guessingMethod(input,attempts, target,totalAttempt);

    }
    public void guessingMethod(Scanner input, int attempts, int target, int totalAttempt)
    {
        Scoring score = new Scoring();
        int diff = 0;
        while(true)
        {
            System.out.print("Guess : " );
            int guess = input.nextInt();
            Difference difference = new Difference();
            if(guess == target)
            {
                System.out.println("Correct! You guessed the number!" );
                System.out.println("Total Attempt : " + attempts );
                score.scoreCard(attempts);
                break;
            }
            if(attempts == totalAttempt)
            {
                System.out.println("!! Game Over !! ");
                System.out.println("You Have Used all the Attempts !! ");
                System.out.println("The Number was " + target);
                break;
            }
            if(guess > target && (guess >= 0 && guess <= 100))
            {
                System.out.println("Too High! ");
                diff = Math.abs(target - guess);
                difference.difference(diff);
                attempts++;
                System.out.println("Your Total Attempts : " + attempts);
            }
            else if(guess < target && (guess >= 0 && guess <= 100))
            {
                System.out.println("Too low! ");
                diff = Math.abs(target - guess);
                difference.difference(diff);
                attempts++;
                System.out.println("Your Total Attempts : " + attempts);
            }
            else System.out.println("Invalid Number (Out Of Range)\nEnter the Guess Again (0-100) : ");
        }
    }
}