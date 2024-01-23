package assignment.DayTwo;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithLimit {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int guess;
		int attempts = 1;
		int maxAttempts = 8;

		System.out.println("Guess number between 1 to 100.");
		guess = sc.nextInt();
		int randomNum = ran.nextInt(101);

		while (guess != randomNum && attempts<maxAttempts) {
			if (guess > randomNum) {
				System.out.println("Too High! Try again.");
				guess = sc.nextInt();
				attempts++;

			} else {
				System.out.println("Too Low! Try again.");
				guess = sc.nextInt();
				attempts++;
			}
		}
		if(guess==randomNum) {
			System.out.println("Congratulations!!! you guessed the number " + randomNum + " in " + attempts + " attempts .");
		}else {
			System.out.println("Nice try!! ,You have used your all attempts.");
		}
		
	}

}
