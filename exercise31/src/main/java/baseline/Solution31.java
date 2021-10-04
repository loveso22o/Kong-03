/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution31
{
    private static final Scanner in = new Scanner(System.in);

    private int age;
    private int heartbeat;

    private int input(String prompt)
    {
        try
        {
            System.out.printf(prompt);
            return in.nextInt();
        }
        catch (InputMismatchException invalid)
        {
            System.out.println("Invalid input, enter a valid input. ");

            input(prompt);
        }

        return 0;
    }

    public double calcHeartRate(int age, int heartbeat, int i)
    {
        return (((220.0 - age) - heartbeat) * (i / 100.0)) + heartbeat;
    }

    private StringBuilder output(int age, int heartbeat)
    {
        StringBuilder table = new StringBuilder();

        table.append(String.format("%nResting Pulse: %d%nAge: %d%n%nIntensity | Heart Rate%n----------|------------%n", heartbeat, age));

        for(int i=55; i<=95; i+=5)
        {
            table.append(String.format("      %d%% | %3.0f bpm%n", i, calcHeartRate(age, heartbeat, i)));
        }

        return table;
    }

    public static void main(String[] args)
    {
        Solution31 main = new Solution31();

        main.age = main.input("Enter your age: ");
        main.heartbeat = main.input("Enter your resting heart rate: ");

        System.out.println(main.output(main.age, main.heartbeat));
    }
}
