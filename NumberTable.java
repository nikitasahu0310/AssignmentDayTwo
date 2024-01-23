package assignment.DayTwo;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int result;
		
		for(int i=1;i<=10;i++) {
			result=num*i;
			System.out.println(num + " * "+ i+ " = "+result);
		}

	}

}
