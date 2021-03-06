package com.arkansascodingacademy;

import java.util.Random;

//TODO BRONZE
//TODO Announce the range of numbers at start of game
//TODO If the guess is off by 11 or more tell the user they are cold
//TODO If the guess is off by 5 to 10 tell the user they are warm
//TODO If the guess is off by less than 5 tell the user they are on fire
//TODO Count how many guess the user took to win and display the number after they guess correctly

//TODO SILVER
//TODO Allow the player to decide to play again after winning.
//TODO Count the number of games played. Show the total number of games played after each win
//TODO Show the average number of guesses across all the games they have played after each win

//TODO GOLD
//TODO Only allow the player five guesses to win. If they still have not won on the fifth guess tell them they lost.
//TODO Count the number of losses and do not include them in the average number of guesses to win calculation.

public class NumberGuess
{
    private int number;

    public NumberGuess()
    {
        Random random = new Random();
        number = random.nextInt(100) + 1;


    }

    public void play()
    {
        System.out.println("Time to play number guess");
        System.out.println("Choose a number between 1 and 100");

        User user = new User();
        int rounds = 0;
        int guess;

        do
        {
            guess = user.getInt("What is your guess? ");

            if (guess <= number - 11||guess >= number + 11)
            {
                System.out.println("Cold!");
                rounds++;
            }
            else if (guess <= number - 5 ||guess >= number + 5)
            {
                System.out.println("Warm!");
                rounds++;
            }
            else if (guess < number || guess > number)
            {
                System.out.println("Fire!");
                rounds++;
            }


        } while (guess != number);

        System.out.println("You got it!");
        System.out.println("It took you " + rounds + " guesses to win!");

    }

}
