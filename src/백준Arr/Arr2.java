package ¹éÁØArr;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}	

		int max = arr[0];
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {		
			if(max < arr[i]) {
				max = arr[i];
				count = i+1;
			}
		}	
		
		System.out.println(max);
		System.out.println(count);
		
		input.close();
	}

}
