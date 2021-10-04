/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Seoyoung Kong
 */
package baseline;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Solution32
{
    private static final Scanner in = new Scanner(System.in);

    private int difficultyLevel()
    {
        while (true)
        {
            System.out.println("Enter the difficulty level (1, 2, or 3): ");

            String level = in.nextLine();

            if(level.matches(".*[a-zA-Z].*"))
            {
                System.out.println("No non-numeric values allowed. You must enter a number. ");
            }
            else if(Integer.parseInt(level) == 1 || Integer.parseInt(level) == 2 || Integer.parseInt(level) == 3)
            {
                return Integer.parseInt(level);
            }
            else
            {
                System.out.println("You must enter a value of 1, 2, or 3. Try again. ");
            }
        }
    }

    public int random(int level)
    {
        if(level == 1)
        {
            return ThreadLocalRandom.current().nextInt(1, 10 + 1);
        }
        else if(level == 2)
        {
            return ThreadLocalRandom.current().nextInt(1, 100 + 1);
        }
        else
        {
            return ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        }

    }

    private boolean guessingGame(int rng)
    {
        boolean notGuessed = true;
        int count = 0;

        System.out.println("I have my number. ");

        while(notGuessed)
        {
            System.out.println("What's your guess? ");
            String guess = in.nextLine();

            if(guess.matches(".*[a-zA-Z].*"))
            {
                System.out.println("You must enter a number. ");
                count ++;
            }
            else
            {
                int numberGuess = Integer.parseInt(guess);

                if(numberGuess == rng)
                {
                    notGuessed = false;
                    count++;

                    System.out.printf("You got it in %d guesses!%n%nDo you wish to play again (Y/N)? ", count);

                    boolean playAgain = in.hasNext("y") || in.hasNext("Y") || in.hasNext("yes" )|| in.hasNext("Yes" );
                    in.nextLine();
                    return playAgain;
                }
                else if(numberGuess < rng)
                {
                    System.out.println("Too low. Guess again: ");
                    count ++;
                }
                else
                {
                    System.out.println("Too high. Guess again: ");
                    count++;
                }
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Solution32 main = new Solution32();

        boolean inProgress = true;

        while(inProgress)
        {
            int level = main.difficultyLevel();

            int rng = main.random(level);

            inProgress = main.guessingGame(rng);
        }


    }
}
