/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test
{
    Solution27 test = new Solution27();

    @Test
    void validateInput()
    {
        assertEquals("\nThere were no errors found. ", test.validateInput("John", "Johnson", "55555", "TK-4321"));
        assertEquals("\nThe zipcode must be a 5 digit number. ", test.validateInput("John", "Doe", "ABCDE", "TK-4321"));
    }

}
