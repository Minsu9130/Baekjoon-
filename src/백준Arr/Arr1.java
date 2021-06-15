package ¹éÁØArr;

import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}	
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < n; i++) {		
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}	
		
		System.out.print(min + " " + max);
		
		input.close();
	}

}
