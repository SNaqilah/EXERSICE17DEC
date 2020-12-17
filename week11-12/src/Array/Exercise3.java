package Array;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		//write a program that create a array of 10 element size, your po=rog should promt the users to input number in array
		//display sum of all array element
		
		final int size =10;
		int[] numb = new int [size];
	
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter" + size + "numbers:");
	
		for (int i=0; i<size; i++) {
			numb[i] = in.nextInt();
		}
		int sum =0;
		for(int i=0; i<size; i++)
		{
			sum+=numb[i];
		}
		System.out.println("Sum numbers: " +sum);
	}
	

}
