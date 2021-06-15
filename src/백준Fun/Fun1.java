package ¹éÁØFun;

import java.util.Scanner;

public class Fun1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i= 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(sum(arr));
		
		input.close();
	}

	public static long sum(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
	
		return sum;	
	}
}
