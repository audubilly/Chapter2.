package Chapter_2;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int sum;
        int product;
        int average;


        System.out.println("Enter num1: ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();

        System.out.println("Enter num2");
        num2 = input.nextInt();

        System.out.println("Enter num3");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        System.out.printf("sum is %d%n" , sum);

        product = num1 * num2 * num3;
        System.out.printf("product is %d%n" ,product);

        average = (num1 + num2 + num3)/3;
        System.out.printf("average is %d%n" , average);

        if (num1 > num2 && num1 > num3)
            System.out.printf("num1 is the largest");
        if (num2 > num1 && num2 > num3)
            System.out.printf("num2 is the largest");
        if (num3 > num1 && num3 > num2)
            System.out.printf("num3 is the largest");






    }



}
