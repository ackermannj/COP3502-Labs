public class main {
    public static void main(String args[]){

    System.out.println(hexString("0xABCDEF"));

    }

    public static long hexString (String hexInput){



        int i = 0;
        int power = hexInput.length()-1;
        long temp = 0;
        long sum = 0;
        while (i < hexInput.length()){

            temp = hexChar(hexInput.charAt(i));
            sum += temp * Math.pow(16, power);
            power --;
            i++;

        }
        return sum;
    }

    public static short hexChar (char letter){

        short temp = 0;
        letter = java.lang.Character.toLowerCase(letter);

        switch (letter){

            case '0':
                temp = 0;
                break;

            case '1':
                temp = 1;
                break;

            case '2':
                temp = 2;
                break;

            case '3':
                temp = 3;
                break;

            case '4':
                temp = 4;
                break;

            case '5':
                temp = 5;
                break;

            case '6':
                temp = 6;
                break;

            case '7':
                temp = 7;
                break;

            case '8':
                temp = 8;
                break;

            case '9':
                temp = 9;
                break;

            case 'a':
                temp = 10;
                break;

            case 'b':
                temp = 11;
                break;

            case 'c':
                temp = 12;
                break;

            case 'd':
                temp = 13;
                break;

            case 'e':
                temp = 14;
                break;

            case 'f':
                temp = 15;
                break;


        }


        return temp;
    }

}
