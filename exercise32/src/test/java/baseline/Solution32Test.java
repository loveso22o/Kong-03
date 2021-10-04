/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test
{
    Solution32 test = new Solution32();

    @Test
    void random()
    {
        int random1 = test.random(1);
        int random2 = test.random(2);
        int random3 = test.random(3);

        assertTrue(random1 <=10 && random1>=1);
        assertTrue(random2 <=100 && random2>=1);
        assertTrue(random3 <=1000 && random3>=1);
    }

}