import java.util.Scanner;
import java.util.Random;

public class Codesoft_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minNumber = 1;
        int maxNumber = 100;
        int rounds;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Enter the number of rounds you want to play:");
        rounds = scanner.nextInt();
        
        for (int round = 1; round <= rounds; round++) {
            int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int guess;
            int attempts = 0;
            
            System.out.println("\nRound " + round + " of " + rounds);
            System.out.println("I've picked a number between " + minNumber + " and " + maxNumber + ". Guess it!");
            
            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;
                
                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
                }
            } while (guess != randomNumber);
        }
        
        System.out.println("\nThank you for playing!");
        scanner.close();
    }
}