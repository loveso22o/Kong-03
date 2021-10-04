/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test
{
    Solution36 test = new Solution36();

    @Test
    void average()
    {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);

        assertEquals(2.0, test.average(numbers));
    }

    @Test
    void max()
    {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);

        assertEquals(3.0, test.max(numbers));
    }

    @Test
    void min()
    {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);

        assertEquals(1.0, test.min(numbers));
    }

    @Test
    void std()
    {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);

        assertEquals(1.29, test.std(numbers, 3.0), 0.001);
    }
}
