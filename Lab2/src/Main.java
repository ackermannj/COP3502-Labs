import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int length = 0;
        int width = 0;
        int radius = 0;
        int sideA = 0;
        int sideB = 0;
        int sideC = 0;


        System.out.println("Enter length of rectangle (positive integer):");
        length = scan.nextInt();
        System.out.println("Enter width of rectangle (positive integer):");
        width = scan.nextInt();
        System.out.println("Now enter the radius of the circle (positive integer):");
        radius = scan.nextInt();
        System.out.println("Enter side A of triangle (positive integer):");
        sideA = scan.nextInt();
        System.out.println("Enter side B of triangle (positive integer):");
        sideB = scan.nextInt();
        System.out.println("Enter side C of triangle (positive integer):");
        sideC = scan.nextInt();
        System.out.println("\n\n");

        System.out.println("Area of rectangle: " + length * width);
        System.out.println("Area of circle: " + (radius * radius) * 3.14);
        System.out.println("Perimeter of rectangle: " + (length + width) * 2);
        System.out.println("Circumference of circle: " + 2 * (3.14 * radius));
        int sum = (sideA + sideB + sideC) / 2;
        System.out.printf("Area of Triangle: %s%n", Math.sqrt((sum) * (sum - sideA) * (sum - sideB) * (sum - sideC)));
        System.out.printf("Perimeter of Triangle: "+ (sideA + sideB + sideC));
        System.out.println("\n\n");

        int radiusS = 0;
        int diameter = 0;
        int heightP = 0;
        int widthP = 0;
        int heightC = 0;
        int radiusC = 0;

        System.out.println("Enter the radius of the sphere: ");
        radiusS = scan.nextInt();
        System.out.println("Enter the diameter of the rectangular prism: ");
        diameter = scan.nextInt();
        System.out.println("Enter the height of the rectangular prism: ");
        heightP = scan.nextInt();
        System.out.println("Enter the width of the rectangular prism: ");
        widthP = scan.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        heightC = scan.nextInt();
        System.out.println("Enter the radius of the cylinder: ");
        radiusC = scan.nextInt();

        System.out.println("The surface area of the sphere is: " + (4 * 3.14 * (radiusS * radiusS)));
        double cubed = Math.pow(radiusS, 3);
        System.out.println("The volume of the sphere is: " + (4 * 3.14 * (cubed / 3)));
        System.out.println("The surface area of the rectangular prism is: " + 2 * ((heightP * diameter) + (heightP * widthP) + (diameter * widthP)) );
        System.out.println("The volume of the rectangular prism is: " + (heightP * diameter * widthP));
        double squared = Math.pow(radiusC, 2);
        System.out.println("The surface area of the cylinder is: " + ((2 * 3.14 * radiusC * heightC) + (2 * 3.14 * squared)));
        System.out.println("The volume of the cylinder is: " + (Math.PI * squared * heightC));

        return;







        //Number test
        //System.out.println(length);
        //System.out.println(width);
        //System.out.println(radius);
        //System.out.println(sideA);
        //System.out.println(sideB);
        //System.out.println(sideC);
        //System.out.println(sum);


    }
}

