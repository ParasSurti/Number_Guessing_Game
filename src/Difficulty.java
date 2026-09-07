public class Difficulty
{
    public static int totalAttempt(String mode)
    {
        String str = mode.toLowerCase();
        if(str.equals("easy")) return 10;
        if(str.equals("medium")) return 7;
        if(str.equals("hard")) return 5;
        else
        {
            System.out.println("Enter the Difficulty properly ");
            System.out.println("'easy', 'medium', 'hard' ");
        }
        return 0;
    }
}