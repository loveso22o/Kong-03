/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;

public class Solution28
{
    private static final Scanner in = new Scanner(System.in);

    private int[] numbers = new int[5];
    private int total;

    private int input(int[] numbers)
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter a number: ");
            numbers[i] = in.nextInt();
        }
        return sum(numbers);
    }

    public int sum(int[] numbers)
    {
        int temp = 0;

        for(int i=0; i<5; i++)
        {
            temp = temp + numbers[i];
        }

        return temp;
    }

    public static void main(String[] args)
    {

        Solution28 main = new Solution28();

        main.total = main.input(main.numbers);

        System.out.printf("The total is %d ", main.total);
    }
}
