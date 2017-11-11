import java.io.*;
import java.util.*;

public class writer
{
    public static void main (String[] args)
    {
        Scanner reader = null;
        PrintWriter writer = null;
        try
        {
            FileInputStream input = new FileInputStream ( "src/input.txt" );
            reader = new Scanner ( input );
            FileOutputStream output = new FileOutputStream ( "src/output.txt" );
             writer = new PrintWriter(output);
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }

        String temp = "";
        int all = 0;


        while(reader.hasNext()) {
            temp = reader.next ();


            if (temp.charAt ( 0 ) == '1') {
                all = all + 128;
            }

            if (temp.charAt ( 1 ) == '1') {
                all = all + 64;
            }

            if (temp.charAt ( 2 ) == '1') {
                all = all + 32;
            }

            if (temp.charAt ( 3 ) == '1') {
                all = all + 16;
            }

            if (temp.charAt ( 4 ) == '1') {
                all = all + 8;
            }

            if (temp.charAt ( 5 ) == '1') {
                all = all + 4;
            }

            if (temp.charAt ( 6 ) == '1') {
                all = all + 2;
            }

            if (temp.charAt ( 7 ) == '1') {
                all = all + 1;
            }
            char x = (char)all;
            all = 0;
            writer.print(x);
            writer.flush();
        }
    }
}