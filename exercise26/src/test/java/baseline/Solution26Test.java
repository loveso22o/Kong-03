/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest
{

    @Test
    void calculateMonthsUntilPaidOff()
    {
        calculator test = new calculator(5000, 12, 100);

        assertEquals(70, test.calculateMonths());
    }

}
