/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34
{
    private static final Scanner in = new Scanner(System.in);

    private String removeEmployee()
    {
        System.out.printf("%nEnter an employee name to remove: ");

        return in.nextLine();
    }

    public static void main(String[] args)
    {
        Solution34 main = new Solution34();

        ArrayList<String> employees = new ArrayList<>();

        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.printf("There are %d employees:%n%s%n%s%n%s%n%s%n%s%n", employees.size(), employees.get(0), employees.get(1), employees.get(2), employees.get(3), employees.get(4));

        String employeeToRemove = main.removeEmployee();

        employees.remove(employeeToRemove);
        System.out.printf("%nThere are %d employees:%n%s%n%s%n%s%n%s", employees.size(), employees.get(0), employees.get(1), employees.get(2), employees.get(3));
    }
}
