package ¹éÁØFun;

import java.util.Scanner;

public class Fun3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		System.out.println(arithmetic(num));
		
		input.close();
	}

	private static int arithmetic(int num) {
		int count = 0;
		
		if(num < 100) {
			return num;
		}
		else {
			count = 99;
			
			if(num == 1000) {
				num = 999;
			}
			
			for (int i=100; i <= num; i++) {
				int first = i/100;
				int second = (i/10)%10;
				int third = i%10;
			
				if((first-second) == (second-third)) {
					count++;
				}
			}
		}
		
		return count;
	}
}
