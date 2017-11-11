import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        String response;

        System.out.println("Question");
        System.out.print("Answer");
        response = scan1.next();
        System.out.println("You said," + response +"!");


        return;

    }
}