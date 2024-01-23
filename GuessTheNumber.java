package assignment.DayTwo;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int guess;
		int attempts = 1;

		System.out.println("Guess number between 1 to 100.");
		guess = sc.nextInt();
		int randomNum = ran.nextInt(101);

		while (guess != randomNum) {
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
		System.out.println("Congratulations!!! you guessed the number"+randomNum+ " in "+attempts+" attempts .");
	}

}
