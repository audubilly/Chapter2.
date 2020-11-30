package Chapter_2;

import java.util.Scanner;

public class Odd0rEven {

    public static void main(String[] args) {

        int Num1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        Num1 = input.nextInt();

        if(Num1%2 == 0) {
            System.out.printf("%d%n is an Even Number", Num1);
        }
            else {
            System.out.printf("%d%n is an Odd Number", Num1);


        }

    }
}
