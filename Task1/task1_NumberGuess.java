//Task1: Number Guess

import java.util.Random;
import java.util.Scanner;

public class task1_NumberGuess
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxValue = 1;
        int minValue = 100;
        int maxAttempt = 15;
        int turns  = 0;
        int score = 0;

        System.out.println("Welcome to Number Guess");

        while (true)
        {
            int targetNumber = random.nextInt(minValue - maxValue + 1) + maxValue;
            int attempts = 0;

            System.out.println("Round " + (turns + 1) + ":");
            System.out.println("You have chosen a number between " + maxValue + " and " + minValue + ". Try to guess it!");

            while (attempts < maxAttempt)
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber)
                {
                    System.out.println("You guessed the correct number");
                    System.out.println("No of Attempts: " + attempts );
                    score++;
                    break;
                }
                else if (userGuess < targetNumber)
                {
                    System.out.println("Too Low \nTry again.");
                }
                else
                {
                    System.out.println("Too High \nTry again.");
                }

                if (attempts == maxAttempt)
                {
                    System.out.println("You've reached the maximum number of attempts.");
                    System.out.println("The correct number was: " + targetNumber);
                }
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();

            if (playAgain == "No" || playAgain == "NO" || playAgain == "no" || playAgain == "n" || playAgain == "N")
            {
                System.out.println("Your total score is: " + score + " out of " + (turns + 1));
                break;
            }

            turns++;
        }

        scanner.close();
    }
}