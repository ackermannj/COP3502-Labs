// extend SugarSmashPlayer as PremiumSugarSmashPlayer here
public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
    private int boosters;

    public PremiumSugarSmashPlayer()
    {
    boosters = 3;

    }


    // override (public!) earnPoints() method here
    @Override
    public void earnPoints()
    {
        if(boosters > 0) {
            setPoints (500 + getPoints ());
            boosters = boosters - 1;
        }

        else{
            System.out.println("Out of boosters!");
            setPoints (100 + getPoints());

        }

    }


    public void buyBoosters()
    {
        boosters = boosters + 3;
    }


}