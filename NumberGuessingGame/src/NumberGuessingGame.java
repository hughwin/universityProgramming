import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	


	public static void main(String[] args) {

		Random random = new Random();
		
		int randomInt = random.nextInt(100); 
		
		randomGuessingGame(randomInt);
		
	}
		
	public static void randomGuessingGame(int randomInt) {
			
		Scanner a = new Scanner(System.in);
		int guessCounter = 1;
		
		while (true) {
			
			System.out.println("Enter your guess");
			int guess = a.nextInt();
			
			
			if (guessCounter == 10 ) {
				System.out.println("You lose!");
				break;
			}
			if (guess == randomInt ) {
				System.out.println("Winner!");
				break;
			}
			if (guess < randomInt ) {
				System.out.println("Higher! You have had " + guessCounter + " guesses");
				guessCounter++;
			}
			if (guess > randomInt ) {
				System.out.println("Lower! You have had " + guessCounter + " guesses");
				guessCounter++;
			}
			
			
			
		}
			
	}
		
		
		

	}
	

