/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;

public class Solution30
{
    private static final Scanner in = new Scanner(System.in);

    private int[][] table;

    private int[][] createTable(int row, int column)
    {
        int[][] temp = new int[row][column];

        for(int i=0; i<temp.length; i++)
        {
            for(int j=0; j<temp[i].length; j++)
            {
                temp[i][j] = (i+1) * (j+1);
            }
        }

        return temp;
    }

    public static void main(String[] args)
    {
        Solution30 main = new Solution30();

        main.table = main.createTable(12,12);

        for (int[] numbers : main.table)
        {
            for (int singleNumber : numbers)
            {
                System.out.printf(" %3d ", singleNumber);
            }

            System.out.println();
        }
    }

}
