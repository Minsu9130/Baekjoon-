package πÈ¡ÿmath2;

import java.util.Scanner;

public class Math2_9 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double R = input.nextDouble();
		
		double Eucli = R*R*Math.PI;
		
		double Taxi = R*R/2*4;
		
		System.out.printf("%.6f", Eucli);
		System.out.println();
		System.out.printf("%.6f", Taxi);
	}

}	


