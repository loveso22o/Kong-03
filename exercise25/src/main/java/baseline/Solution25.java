/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;
import java.util.*;

public class Solution25 {
    public static void passwordValidator(String input)
    {
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())//for loop to determine complexity of cases
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("is a very strong password.");
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("is a strong password.");
        else if(hasLower || hasUpper)
            System.out.print("is a weak password.");
        else
            System.out.print("is a very weak password.");

    }

    public static void main(String[] args)
    {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        input = sc.nextLine();
        passwordValidator(input);
    }

}
