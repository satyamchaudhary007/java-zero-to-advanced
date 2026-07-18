// Learning Java Zero to Advanced
// Program to Convert Fahrenheit to Celsius

import java.util.Scanner;

public class program14 {
    public static void main(String args [] ) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fahrenheit to Celsius Converter!");

        System.out.print("Please enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9;

        System.out.println("Temperature in Celsius = " + celsius + " °C");
    }
}