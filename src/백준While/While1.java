package ¹éÁØWhile;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			if (num1 == 0 && num2 == 0) {
				break;
			}
			sum = num1 + num2;
			
			System.out.println(sum);
		}
		
		input.close();

	}

}
