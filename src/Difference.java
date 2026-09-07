public class Difference
{
    public void difference(int difference)
    {
        if(difference < 5)
        {
            System.out.println("Hint : Very close!");
        }
        else if(difference < 20)
        {
            System.out.println("Hint : Getting close!");
        }
        else
        {
            System.out.println("Hint : Far away!");
        }
    }
}
