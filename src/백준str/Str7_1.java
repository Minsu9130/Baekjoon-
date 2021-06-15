package ¹éÁØstr;

import java.util.Scanner;

public class Str7_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();

		in.close();

		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

		System.out.print(A > B ? A : B);

	}	
}
