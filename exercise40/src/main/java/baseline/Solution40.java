/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.*;

public class Solution40
{
    private static final Scanner in = new Scanner(System.in);

    public HashMap firstNameMap(String[] lastNames)
    {
        HashMap<String, String> firstNames = new HashMap<>();

        firstNames.put(lastNames[0],"John");
        firstNames.put(lastNames[1],"Tou");
        firstNames.put(lastNames[2],"Michaela");
        firstNames.put(lastNames[3], "Jake");
        firstNames.put(lastNames[4], "Jacquelyn");
        firstNames.put(lastNames[5], "Sally");

        return firstNames;
    }

    public HashMap positionMap(String[] lastNames)
    {
        HashMap<String, String> positions = new HashMap<>();

        positions.put(lastNames[0], "Manager");
        positions.put(lastNames[1], "Software Engineer");
        positions.put(lastNames[2], "District Manager");
        positions.put(lastNames[3], "Programmer");
        positions.put(lastNames[4], "DBA");
        positions.put(lastNames[5], "Web Developer");

        return positions;
    }

    public HashMap seperationDateMap(String[] lastNames)
    {
        HashMap<String, String> separationDate = new HashMap<>();

        separationDate.put(lastNames[0], "2016-12-31");
        separationDate.put(lastNames[1], "2016-10-05");
        separationDate.put(lastNames[2], "2015-12-19");
        separationDate.put(lastNames[3], " ");
        separationDate.put(lastNames[4], " ");
        separationDate.put(lastNames[5], "2015-12-18");

        return separationDate;
    }

    private String input(String prompt)
    {
        System.out.println(prompt);

        return in.nextLine();
    }

    public ArrayList<String> searchTable(ArrayList<HashMap<String, String>> employees, String[] lastNames, String searchString)
    {
        HashMap<String, String> firstNames = employees.get(0);

        ArrayList<String> searched = new ArrayList<>();

        for(String input : lastNames)
        {
            String firstName =  firstNames.get(input).toLowerCase();
            String lastName =  input.toLowerCase();

            if(firstName.contains(searchString) || lastName.contains(searchString))
            {
                searched.add(input);
            }
        }

        return searched;
    }

    private void printTable(ArrayList<HashMap<String, String>> employees, String[] lastName, ArrayList<String> searchedLastName)
    {
        HashMap<String, String> firstNames = employees.get(0);
        HashMap<String, String> positions = employees.get(1);
        HashMap<String, String> separationDate = employees.get(2);

        System.out.format("%-20s| %-18s| %-15s%n", "Name", "Position", "Separation Date");
        System.out.println("--------------------------------------------------------");

        int count = 0;

        for(String temp : searchedLastName)
        {
            System.out.format("%-20s| %-18s| %-15s%n", firstNames.get(searchedLastName.get(count)) + " " + temp, positions.get(searchedLastName.get(count)), separationDate.get(lastName[count]));

            count++;
        }
    }

    public static void main(String[] args)
    {
        Solution40 main = new Solution40();

        String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

        ArrayList<HashMap<String, String>> completed = new ArrayList<>();

        completed.add(main.firstNameMap(lastNames));
        completed.add(main.positionMap(lastNames));
        completed.add(main.seperationDateMap(lastNames));

        String searchString = main.input("Enter a search string: ");

        ArrayList<String> searchedStrings = main.searchTable(completed, lastNames, searchString);

        main.printTable(completed, lastNames, searchedStrings);
    }
}
