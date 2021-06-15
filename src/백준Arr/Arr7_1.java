package ¹éÁØArr;

import java.util.Scanner;

public class Arr7_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int casenum = input.nextInt();
		String[] arr = new String[casenum];

		input.nextLine();

		for(int i=0; i < arr.length; i++) {
			arr[i] = input.nextLine();
		}

		for(int i=0; i < arr.length; i++) {
			String[] str = arr[i].split(" ");

			double sum = 0.0;
			for (int j = 1; j < str.length; j++) {
				sum = sum + Integer.parseInt(str[j]);
			}

			double average = sum/Integer.parseInt(str[0]);

			double count = 0;
			for(int k = 0; k < str.length; k++) {
				if(Integer.parseInt(str[k]) > average) {
					count++;
				}
			}

			System.out.printf("%.3f", count/Integer.parseInt(str[0])*100);
			System.out.print("%\n");
		}

		input.close();

	}

}
