package Chapter_2;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {

        double userWeightInKilograms ;
        double heightInMeters;
        double bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter UserWeightInKilograms: ");
        userWeightInKilograms = input.nextDouble();

        System.out.println("Enter HeightInMeters: ");
        heightInMeters = input.nextDouble();

        bodyMassIndex = (userWeightInKilograms / (heightInMeters * heightInMeters));

        if (bodyMassIndex < 18.5){
            System.out.printf("BMI is %f, you are Underweight" , bodyMassIndex );
        }

        if(bodyMassIndex >=18.5 && bodyMassIndex <= 24.9){
            System.out.printf("BMI is %f, you are Normal", bodyMassIndex);
        }

        if(bodyMassIndex >=25 && bodyMassIndex <=29.9){
            System.out.printf("BMI is %f, you are Overweight", bodyMassIndex);
        }

        if(bodyMassIndex >= 30){
            System.out.printf("BMI is %f , you are Obese", bodyMassIndex);
        }
    }




}
