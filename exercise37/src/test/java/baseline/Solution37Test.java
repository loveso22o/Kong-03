/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test
{
    Solution37 test = new Solution37();

    @Test
    void passwordGenerator()
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()_+{}[]<>?,.~";
        String digits = "1234567890";

        for(int i=0; i<100; i++)
        {
            String password = test.passwordGenerator(8, 2, 2);

            System.out.println("Password " + i + " is " + password);

            int letters = 0;
            int special = 0;
            int numbers = 0;

            for(int j=0; j<password.length(); j++)
            {
                if (alphabet.contains(String.valueOf(password.charAt(j))))
                {
                    letters++;
                }
                if (specialCharacters.contains(String.valueOf(password.charAt(j))))
                {
                    special++;
                }
                if (digits.contains(String.valueOf(password.charAt(j))))
                {
                    numbers++;
                }
            }

            assertTrue(letters > (special + numbers));
            assertTrue(password.length() >= 8);
            assertEquals(2, special);
            assertEquals(2, numbers);

        }
    }

}
