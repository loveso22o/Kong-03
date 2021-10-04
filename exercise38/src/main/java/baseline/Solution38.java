/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution38
{
    private static final Scanner in = new Scanner(System.in);

    public int[] filterEvenNumbers(int[] array)
    {
        int[] evenArray = new int[array.length];

        int count = 0;

        for(int num : array)
        {
            if(num % 2 == 0)
            {
                evenArray[count] = num;
                count++;
            }
        }

        int[] updatedArray = new int[count];

        for(int i=0; i<updatedArray.length; i++)
        {
            updatedArray[i] = evenArray[i];
        }

        return updatedArray;
    }

    public int[] convertToArray(String input)
    {
        String[] array = input.split(" ");
        int[] intArray = new int[array.length];

        for(int i=0; i<array.length; i++)
        {
            intArray[i] = Integer.parseInt(array[i]);
        }

        return intArray;
    }

    private String getList(String prompt)
    {
        System.out.println(prompt);

        return in.nextLine();
    }

    public static void main(String[] args)
    {
        Solution38 main = new Solution38();

        String list = main.getList("Enter a list of numbers, separated by spaces: ");

        int[] array = main.convertToArray(list);

        int[] evenArray = main.filterEvenNumbers(array);

        System.out.println("The even numbers are " + Arrays.toString(evenArray));
    }
}
