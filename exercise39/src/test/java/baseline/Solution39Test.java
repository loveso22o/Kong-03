/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class Solution39Test
{
    Solution39 test = new Solution39();

    String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

    @Test
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

}
