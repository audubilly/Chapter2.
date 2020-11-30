package Chapter_2;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        int firstInput;
        int secondInput;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstInput: ");
        firstInput = input.nextInt();

        System.out.println("Enter Num2");
        secondInput= input.nextInt();

        if(firstInput % secondInput == 0){
            System.out.printf("%d is a multiple of %d", firstInput, secondInput);
        }
        else {
            System.out.printf("%d is not a multiple of %d", firstInput,secondInput );
        }
    }
}
