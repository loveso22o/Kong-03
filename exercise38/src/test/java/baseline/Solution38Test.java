/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test
{
    Solution38 test = new Solution38();

    @Test
    void filterEvenNumbers()
    {
        int[] list = {1, 2, 3, 4, 5};

        int[] expected = {2, 4};

        assertArrayEquals(expected, test.filterEvenNumbers(list));
    }

    @Test
    void convertToArray()
    {
        String list = "1 2 3 4 5";

        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, test.convertToArray(list));
    }

}
