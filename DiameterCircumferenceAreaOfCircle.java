package Chapter_2;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {

        int radius;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = input.nextInt();

        System.out.printf("%d is the Diameter. %n" , (2 * radius));

        System.out.printf("%f is the Circumference. %n" , (2 * Math.PI * radius));

        System.out.printf("%f is the Area. %n", (Math.PI * (radius * radius)));



    }



}
