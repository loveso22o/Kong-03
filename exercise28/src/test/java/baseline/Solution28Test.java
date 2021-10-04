/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution28Test
{
    Solution28 test = new Solution28();

    @Test
    void sum()
    {
        int[] case1 = {1,2,3,4,5};
        assertEquals(15, test.sum(case1));

        int[] case2 = {10,10,10,10,10};
        assertEquals(50, test.sum(case2));
    }

}
