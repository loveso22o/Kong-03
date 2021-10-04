/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test
{
    Solution40 test = new Solution40();

    String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

    void firstNameMap()
    {
        HashMap<String, String> firstNames = new HashMap<>();

        firstNames.put(lastNames[0],"John");
        firstNames.put(lastNames[1],"Tou");
        firstNames.put(lastNames[2],"Michaela");
        firstNames.put(lastNames[3], "Jake");
        firstNames.put(lastNames[4], "Jacquelyn");
        firstNames.put(lastNames[5], "Sally");

        HashMap<String, String> testMap = new HashMap<>();
        testMap = test.firstNameMap(lastNames);
        assertEquals(firstNames, testMap);
    }

    @Test
    void positionMap()
    {
        HashMap<String, String> positions = new HashMap<>();

        positions.put(lastNames[0], "Manager");
        positions.put(lastNames[1], "Software Engineer");
        positions.put(lastNames[2], "District Manager");
        positions.put(lastNames[3], "Programmer");
        positions.put(lastNames[4], "DBA");
        positions.put(lastNames[5], "Web Developer");

        HashMap<String, String> testMap = new HashMap<>();
        testMap = test.positionMap(lastNames);
        assertEquals(positions, testMap);
    }

    @Test
    void seperationDateMap()
    {
        HashMap<String, String> separationDate = new HashMap<>();

        separationDate.put(lastNames[0], "2016-12-31");
        separationDate.put(lastNames[1], "2016-10-05");
        separationDate.put(lastNames[2], "2015-12-19");
        separationDate.put(lastNames[3], " ");
        separationDate.put(lastNames[4], " ");
        separationDate.put(lastNames[5], "2015-12-18");

        HashMap<String, String> testMap = new HashMap<>();
        testMap = test.seperationDateMap(lastNames);
        assertEquals(separationDate, testMap);
    }

    @Test
    void searchTable(){
        String searchString = "jac";

        ArrayList<HashMap<String, String>> complete = new ArrayList<>();

        complete.add(test.firstNameMap(lastNames));
        complete.add(test.positionMap(lastNames));
        complete.add(test.seperationDateMap(lastNames));
        ArrayList<String> searchedStrings = test.searchTable(complete, lastNames, searchString);
        assertEquals(searchedStrings, test.searchTable(complete, lastNames, searchString));
    }
}
