// Learning Java Zero to Advanced
// Program to Calculate Compound Interest

import java.util.Scanner;

public class program13{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Compound Interest Calculator!");

        System.out.print("Please enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Please enter rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Please enter time (in years): ");
        double time = input.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest = " + compoundInterest);
        System.out.println("Total Amount = " + amount);
    }
}