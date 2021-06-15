package ¹éÁØArr;

import java.util.Scanner;

public class Arr7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int casenum = input.nextInt();
		
		for(int i=0; i < casenum; i++) {
			int n = input.nextInt();
			int[] arr = new int[n];
			
			double sum = 0.0;
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = input.nextInt();
				sum = sum + arr[j];
			}
			
			double average = sum/n;
			
			double count = 0;
			for(int k = 0; k < arr.length; k++) {
				if(arr[k] > average) {
					count++;
				}
			}
			
			System.out.printf("%.3f", count/n*100);
			System.out.print("%\n");
		}
		
		input.close();

	}

}
