/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;

public class Solution26
{
    private static final Scanner in = new Scanner(System.in);

    private double balance;
    private double apr;
    private double monthlyPayment;
    private double months;

    private double input(String prompt)
    {
        System.out.printf(prompt);
        return in.nextDouble();
    }

    public static void main(String[] args)
    {
        Solution26 main = new Solution26();

        main.balance = main.input("What is your balance? ");
        main.apr = main.input("What is the APR on the card (as a percent)? ");
        main.monthlyPayment = main.input("What is the monthly payment you can make? ");

        calculator payment = new calculator(main.balance, main.apr, main.monthlyPayment);

        main.months = payment.calculateMonths();

        System.out.printf("It will take you %.0f months to pay off this card.", main.months);
    }

}
