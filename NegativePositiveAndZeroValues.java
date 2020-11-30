package Chapter_2;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {

    public static void main(String[] args) {

            int number1;
            int number2;
            int number3;
            int number4;
            int number5;
            int countOfNegatives = 0;
            int countOfPositives = 0;
            int countOfZeros = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number1: ");
       number1 = input.nextInt();
       if(number1 < 0) {
           countOfNegatives = countOfNegatives + 1;
       }
       if(number1 == 0){
           countOfZeros = countOfZeros + 1;
       }
       if(number1 > 0){
           countOfPositives = countOfPositives + 1;
       }


        System.out.println("Enter Number2: ");
        number2 = input.nextInt();

       if(number2 < 0) {
            countOfNegatives = countOfNegatives + 1;
        }
        if(number2 == 0){
            countOfZeros = countOfZeros + 1;
        }
        if(number2 > 0){
            countOfPositives = countOfPositives + 1;
        }

        System.out.println("Enter Number3: ");
        number3 = input.nextInt();

        if(number3< 0) {
            countOfNegatives = countOfNegatives + 1;
        }
        if(number3 == 0){
            countOfZeros = countOfZeros + 1;
        }
        if(number3 > 0){
            countOfPositives = countOfPositives + 1;
        }

        System.out.println("Enter Number4: ");
        number4 = input.nextInt();

        if(number4 < 0) {
            countOfNegatives = countOfNegatives + 1;
        }
        if(number4 == 0){
            countOfZeros = countOfZeros + 1;
        }
        if(number4 > 0){
            countOfPositives = countOfPositives + 1;
        }

        System.out.println("Enter Number5: ");
        number5 = input.nextInt();

        if(number5 < 0) {
            countOfNegatives = countOfNegatives + 1;
        }
        if(number5 == 0){
            countOfZeros = countOfZeros + 1;
        }
        if(number5 > 0){
            countOfPositives = countOfPositives + 1;
        }

        System.out.printf("CountOfPositives is %d%nCountOfNegatives is %d%nCountOfZeros is %d%n", countOfPositives, countOfNegatives, countOfZeros);
    }
}
