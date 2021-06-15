package πÈ¡ÿ¿Á±Õ;

import java.util.Scanner;

public class Recursive1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(Factorial(n));
	}

	public static int Factorial (int num) {
		
		int mul = num;
		
		if(num == 0) {
			return 1;
		}
		else {
			return mul * Factorial(num-1);
		}
		
	}
}
