package assignment.DayTwo;

//Among the numbers between 1 to 30, find out the numbers which are divisible by 3. Create an array of these numbers and print the same.
public class ArrayNumber {

	public static void main(String[] args) {
		int divisible[] = new int[10];

		int count=0;
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
              divisible[count]=i;
              count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(divisible[i]+" ");
		}

	}

}
