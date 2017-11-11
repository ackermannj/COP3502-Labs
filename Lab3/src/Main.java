import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);

        int mpg;
        double capacity;
        double pfilled;

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer:");
        mpg = scan.nextInt();
        if (mpg < 0)
        {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number:");
        capacity = scan.nextDouble();
        if (capacity < 0)
        {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ARE ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%):");
        pfilled = scan.nextDouble();
        if (pfilled < 0)
        {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
            return;
        }

        int rawRange = (int) (mpg * capacity * (pfilled * 0.01));
        //Number test
        //System.out.println(rawRange);

        if (rawRange > 25)
        {
            System.out.println("Keep driving! Your current estimated range is: " + rawRange + " miles!");
        }

        else
        {
            System.out.println("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
        }



    }
}