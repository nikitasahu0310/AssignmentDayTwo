package assignment.DayTwo;

import java.util.Random;

public class RandomArraySumAvg {

	public static void main(String[] args) {
       int arr[]=new int[75];
       Random ran=new Random();
       
       for(int i=0;i<arr.length;i++) 
       {
    	  arr[i]=ran.nextInt(101); 
       }
       
       int sum=0;
       for(int i=0;i<arr.length;i++) {
    	   sum=sum+arr[i];
       }
       double avg= sum/arr.length;
       System.out.println("Sum : "+ sum);
       System.out.println("Average: "+ avg);
	}

}
