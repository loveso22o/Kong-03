/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test
{
    Solution25 test = new Solution25();

    @Test
    void passwordValidator()
    {
        assertEquals(1, test.passwordValidator("12345"));
        assertEquals(2, test.passwordValidator("abcdef"));
        assertEquals(3, test.passwordValidator("abc123xyz"));
        assertEquals(4, test.passwordValidator("1337h@xor!"));
    }
}