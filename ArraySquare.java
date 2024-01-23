package assignment.DayTwo;

public class ArraySquare {

	public static void main(String[] args) {

		int arr[] = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i]=(i+1)*(i+1);
			System.out.println((i+1)+" of square: "+arr[i]);
		}
	}

}
