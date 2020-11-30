package Chapter_2;

import java.util.Scanner;

public class SeparatingTheDigitsOfAnInteger {
    public static void main(String[] args) {

        int userInput;

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;
        int fifthDigit;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 digit input: ");
        userInput = input.nextInt();

        // to separate and print out the userInput;

        firstDigit = (userInput/10000);
        secondDigit =((userInput/1000) % 10);
        thirdDigit = ((userInput/100) % 10);
        fourthDigit = ((userInput/10) % 10);
        fifthDigit = (userInput%10);

        System.out.printf("%d   %d   %d   %d   %d", firstDigit,secondDigit,thirdDigit,fourthDigit,fifthDigit);

    }



}
