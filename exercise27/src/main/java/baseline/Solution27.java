/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;

public class Solution27
{
    private static final Scanner in = new Scanner(System.in);

    private String first;
    private String last;
    private String zip;
    private String ID;
    private String result;

    private String input(String prompt)
    {
        System.out.printf(prompt);

        return in.nextLine();
    }

    public String validateInput(String first, String last, String zip, String ID)
    {
        boolean firstName;
        boolean firstNameCheck;
        boolean lastName;
        boolean lastNameCheck;
        boolean zipCheck;
        boolean idCheck;
        String output = "";

        firstName = firstNamePresent(first);
        firstNameCheck = checkFirstName(first);
        lastName = lastNamePresent(last);
        lastNameCheck = checkLastName(last);
        zipCheck = checkZip(zip);
        idCheck = checkID(ID);

        if(!firstName)
        {
            output = output + "\nThe first name must be filled in. ";
        }
        if(!firstNameCheck)
        {
            output = output + "\nThe first name must be at least 2 characters long. ";
        }
        if(!lastName)
        {
            output = output + "\nThe last name must be filled in. ";
        }
        if(!lastNameCheck)
        {
            output = output +  "\nThe last name must be at least 2 characters long. ";
        }
        if(!zipCheck)
        {
            output = output + "\nThe zipcode must be a 5 digit number. ";
        }
        if(!idCheck)
        {
            output = output + "\nThe employee ID must be in the format of AA-1234. ";
        }
        if(firstNameCheck && lastNameCheck && zipCheck && idCheck)
        {
            output = "\nThere were no errors found. ";
        }

        return output;
    }

    private boolean firstNamePresent(String first)
    {
        return !first.isEmpty();
    }

    private boolean lastNamePresent(String last)
    {
        return !last.isEmpty();
    }

    private boolean checkFirstName(String first)
    {
        return first.length() > 2;
    }

    private boolean checkLastName(String last)
    {
        return last.length() > 2;
    }

    private boolean checkZip(String zip)
    {
        char[] temp = zip.toCharArray();

        for(char i : temp)
        {
            if(Character.isAlphabetic(i))
            {
                return false;
            }
        }

        return zip.length() == 5;
    }

    private boolean checkID(String ID)
    {
        if(ID.length() != 7)
        {
            return false;
        }
        else
        {
            return ID.substring(0, 2).matches("[a-zA-Z]+") && ID.charAt(2) == '-' && ID.substring(3, 7).matches("[0-9]+");
        }
    }

    public static void main(String[] args)
    {
        Solution27 main = new Solution27();

        main.first = main.input("Enter the first name: ");
        main.last = main.input("Enter the last name: ");
        main.zip = main.input("Enter the ZIP code: ");
        main.ID = main.input("Enter the employee ID: ");

        main.result = main.validateInput(main.first, main.last, main.zip, main.ID);

        System.out.printf(main.result);
    }
}