/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Solution33
{
    private static final Scanner in = new Scanner(System.in);

    private String answer()
    {
        String[] answers = {"Yes", "No", "Maybe", "Ask again later."};

        int randomValue = ThreadLocalRandom.current().nextInt(1, 4+1);

        if(randomValue == 1)
        {
            return answers[0];
        }
        else if(randomValue == 2)
        {
            return answers[1];
        }
        else if(randomValue == 3)
        {
            return answers[2];
        }
        else
        {
            return answers[3];
        }
    }

    private void initialQuestion(String prompt)
    {
        System.out.println(prompt);

        in.nextLine();
    }



    public static void main(String[] args)
    {
        Solution33 main = new Solution33();

        main.initialQuestion("What's your question? ");

        System.out.println(main.answer());
    }

}
