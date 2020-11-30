package Chapter_2;

import java.util.Scanner;

public class ComparingIntegers {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1: ");
        num1 = input.nextInt();

        System.out.println("Enter num2: ");
        num2 = input.nextInt();

        if (num1 < num2)
            System.out.printf("%d is less than %d%n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d is larger than %d%n", num1, num2);
        if (num1 == num2)
            System.out.printf("%d is equal to %d%n", num1, num2);
        if (num1 <= num2)
            System.out.printf("%d is less than or equal to %d%n", num1, num2);
        if (num1 >= num2)
            System.out.printf("%d is greater than or equal to %d%n", num1, num2);
    }





}





















