package Chapter_2;

//Write an application that asks the user to enter two integers, obtains them
//from the user and prints their sum, product, difference and quotient (division).

import java.util.Scanner;

public class Arithmetics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userInput1;
        int userInput2 ;
        int product;
        int difference;
        int quotient;

        System.out.print("Enter userInput1: ");
        userInput1 = input.nextInt();

        System.out.print("Enter userInput2: ");
        userInput2= input.nextInt();

        product =userInput1 * userInput2;
        difference = userInput1 - userInput2;

        quotient = userInput1 / userInput2 ;

        System.out.printf("Product is %d%n"  , product);

        System.out.printf("Difference is %d%n", difference);

        System.out.printf("Quotient is %d%n", quotient);

    }

}
