public class Scoring
{
    public static void scoreCard(int attempt)
    {
        if(attempt == 1)
        {
            System.out.println("You have scored 100 points!! ");
        }
        else if(attempt <= 3)
        {
            System.out.println("You have scored 80 points");
        }
        else if(attempt <= 5)
        {
            System.out.println("You have scored 60 points");
        }
        else System.out.println("You have scored 40 points");
    }
}
