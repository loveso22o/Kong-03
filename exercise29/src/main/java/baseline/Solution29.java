/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;

public class Solution29
{
    private static final Scanner in = new Scanner(System.in);

    private String rate;
    private int r;
    private int years;


    private String input(String prompt)
    {
        System.out.printf(prompt);
        return in.nextLine();
    }

    public String output(String rate)
    {
        while (rate.equals("0") || rate.matches(".*[a-zA-Z].*") || Integer.parseInt(rate) < 0)
        {
            System.out.println("Sorry. That's not a valid input. ");

            rate = input("What is the rate of return? ");
        }

        return rate;
    }

    public static void main(String[] args)
    {
        Solution29 main = new Solution29();

        main.rate = main.input("What is the rate of return? ");

        main.rate = main.output(main.rate);

        main.r = Integer.parseInt(main.rate);

        main.years = 72 / main.r;

        System.out.printf("It will take %d years to double your initial investment. ", main.years);
    }
}
