package πÈ¡ÿ¿Á±Õ;

import java.util.Scanner;

public class Recursive2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
	
		System.out.println(Fibonacci(n));
	}

	public static int Fibonacci (int num) {
		
		if(num <= 1) {
			return num;
		}
		else {
			return Fibonacci (num-2) +Fibonacci (num-1);
		}
	}
}
