/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36
{
    private static final Scanner in = new Scanner(System.in);

    private double input()
    {
        String userInput;
        double number = 0;

        System.out.println("Enter a number: ");
        userInput = in.nextLine();

        if(userInput.equals("done"))
        {
            return -1;
        }

        try
        {
            number = Double.parseDouble(userInput);
        }
        catch(NumberFormatException invalidInput)
        {
            System.out.println("Enter a number or \"done\"");
        }

        if(number > 0)
        {
            return number;
        }
        else
        {
            System.out.println("Enter a positive number ");
        }

        return -2;
    }

    public double average(ArrayList<Double> numbers)
    {
        double numAverage = 0;

        for(double number : numbers)
        {
            numAverage += number;
        }

        return numAverage / numbers.size();
    }

    public double max(ArrayList<Double> numbers)
    {
        double maxNumber = numbers.get(0);

        for(double number : numbers)
        {
            if(number > maxNumber)
            {
                maxNumber = number;
            }
        }

        return maxNumber;
    }

    public double min(ArrayList<Double> numbers)
    {
        double minNumber = numbers.get(0);

        for(double number : numbers)
        {
            if(number < minNumber)
            {
                minNumber = number;
            }
        }

        return minNumber;
    }

    public double std(ArrayList<Double> numbers, double numAverage)
    {
        double numberStd = 0;

        for(double number : numbers)
        {
            numberStd += Math.pow((number - numAverage), 2);
        }

        numberStd = numberStd / numbers.size();

        return Math.sqrt(numberStd);
    }

    private void printAllNumbers(ArrayList<Double> numbers)
    {
        System.out.println("Numbers: ");

        for(int i=0; i<numbers.size(); i++)
        {
            if(i > 0)
            {
                System.out.println(",");
            }

            System.out.printf("%.0f", numbers.get(i));
        }

        System.out.println("");
    }



    public static void main(String[] args)
    {
        Solution36 main = new Solution36();

        ArrayList<Double> numbers = new ArrayList<>();

        double nextNumber;

        while(true)
        {
            nextNumber = main.input();

            if(nextNumber == -1)
            {
                break;
            }
            else if(nextNumber > 0)
            {
                numbers.add(nextNumber);
            }
        }

        double numAverage = main.average(numbers);
        double numMax = main.max(numbers);
        double numMin = main.min(numbers);
        double numStd = main.std(numbers, numAverage);

        main.printAllNumbers(numbers);

        System.out.printf("The average is %.1f" + "%nThe minimum is %.0f" + "%nThe maximum is %.0f" + "%nThe standard deviation is %.2f%n", numAverage, numMin, numMax, numStd);
    }
}
