public class SugarSmashPlayer
{
    private int IDnumber;
    private static String playername;
    protected int points;

    public SugarSmashPlayer()
    {
        IDnumber = 0;
        playername = " ";
        points = 0;
    }
    public void setIdNumber(int num)
    {
        IDnumber = num;
    }
    public void setName(String player)
    {
        playername = player;
    }
    public void setPoints(int pts)
    {
        points = pts;
    }
    public void earnPoints()
    {
        points = points + 100;
    }
    public int getIdNumber()
    {
        return IDnumber;
    }
    public String getName()
    {
        return playername;
    }
    public int getPoints()
    {
        return points;
    }
}