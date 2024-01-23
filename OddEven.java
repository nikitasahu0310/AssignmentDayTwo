package assignment.DayTwo;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The "+ num +" number is even.");
		}else {
			System.out.println("The "+ num +" number is odd.");
		}
        

	}

}
