public class BloodData
{
    private static String bloodtype;
    private static String rH;

    public void main(String[] args){

        bloodtype = "O";
        rH = "+";

    }

    public BloodData(){}


    public BloodData(String bType, String rh)
    {
        bType = bloodtype;
        rh = rH;

    }
    public void setBloodType(String bType)
    {
        this.bloodtype = bType;
    }
    public String getBloodType()
    {
        return bloodtype;
    }
    public void setRhFactor(String rh)
    {
        this.rH = rh;
    }
    public String getRhFactor()
    {
        return rH;
    }
}