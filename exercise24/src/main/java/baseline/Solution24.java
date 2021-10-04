/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24
{
    private static final Scanner in = new Scanner(System.in);

    private String userInput1;
    private String userInput2;

    private String input (String prompt)
    {
        System.out.printf(prompt);
        return in.nextLine();
    }

    private char[] convert(String userInput)
    {
        return userInput.toCharArray();
    }


    public boolean isAnagram (String word1, String word2)
    {
        char[] input1 = convert(word1);
        char[] input2 = convert(word2);

        Arrays.sort(input1);
        Arrays.sort(input2);

        return (Arrays.equals(input1, input2));
    }

    public static void main(String[] args)
    {
        Solution24 main = new Solution24();

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        main.userInput1 = main.input("Enter the first string: ");
        main.userInput2 = main.input("Enter the second string: ");

        if(main.isAnagram(main.userInput1, main.userInput2))
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams. %n", main.userInput1, main.userInput2);
        }
        else
        {
            System.out.printf("\"%s\" and \"%s\" are not anagrams. %n", main.userInput1, main.userInput2);
        }
    }
}
