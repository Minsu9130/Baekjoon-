package ¹éÁØWhile;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int n = num;
		int count = 0;
		String ne = "";
		
		while (true) {
					
			int n1 = (num%10);
			int n2 = (num/10)+(num%10);
			
			if(10 <= n2) {
				n2 = n2%10;
			}
			
			ne = Integer.toString(n1) + Integer.toString(n2);
			
			count++;
			
			num = Integer.parseInt(ne);
			
			if (num == n) {
				break;
			}
		}
		System.out.println(count);
		
		input.close();
	}

}
