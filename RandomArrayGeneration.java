package assignment.DayTwo;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayGeneration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int count = 0;

		while (count < 3) {
			System.out.println("Enter the size between 1 to 10 .");
			size = sc.nextInt();

			if (size >= 1 && size <= 10) {
				break;// if size will between the 1 to 10 it will the break the while loop
			} else {
				count++;
			}

		}
		if (count == 3) {
			System.out.println("Array size entered is not correct  ");
			System.exit(0);
		}
		double randomArr[] = new double[size];
		Random ran = new Random();
		for (int i = 0; i < size; i++) {
			randomArr[i] = 100.0 + (500.0 - 100.0) * ran.nextDouble();

		}
		System.out.print("Random Array: ");
		for (int i = 0; i < size; i++) {
			System.out.println(randomArr[i] + " ");
		}

	}

}
