public class Difficulty
{
    public static int totalAttempt(String mode)
    {
        if(mode.equals("easy")) return 10;
        if(mode.equals("medium")) return 7;
        else return 5;

    }
}
