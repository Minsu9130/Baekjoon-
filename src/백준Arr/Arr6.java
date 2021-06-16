package ¹éÁØArr;

import java.util.Scanner;

public class Arr6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		String[] arr = new String[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.next();
		}
		
		int count = 0;
		int[] score = new int[num];
		
		for(int i=0; i < arr.length; i++) {
			count = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].substring(j,j+1).equals("O")) {
					count++;
					score[i] = score[i] + count;
				}
				else {
					score[i] = score[i] + 0;
					count = 0;
				}
			}
		}
		
		for(int i=0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		input.close();
	}

}
