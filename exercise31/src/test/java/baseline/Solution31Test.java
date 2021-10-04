/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test
{
    Solution31 test = new Solution31();

    @Test
    void calcHeartRate()
    {
        double heartRate = test.calcHeartRate(22, 65, 80);
        assertEquals(171, Math.floor(heartRate));
    }

}
