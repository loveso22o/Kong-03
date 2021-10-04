/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35
{
    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();

    private String getName()
    {
        System.out.println("Enter a name: ");

        return in.nextLine();
    }

    private int randomIndex(int length)
    {
        return rand.nextInt(length);
    }

    public String winner(ArrayList<String> names, int random)
    {
        return names.get(random);
    }

    public static void main(String[] args)
    {
        Solution35 main = new Solution35();
        ArrayList<String> names = new ArrayList<>();

        String name;

        while(true)
        {
            name = main.getName();

            if(name.equals(""))
            {
                break;
            }
            else
            {
                names.add(name);
            }
        }

        int random = main.randomIndex(names.size());

        String winnerName = main.winner(names, random);

        System.out.printf("The winner is... %s.", winnerName);
    }

}