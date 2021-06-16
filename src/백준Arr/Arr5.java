package ¹éÁØArr;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		double[] arr = new double[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		double max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]/max*100;
			sum = sum + arr[i];
		}
	
		double average = sum/num;
		
		System.out.print(average);
		
		input.close();
	}

}