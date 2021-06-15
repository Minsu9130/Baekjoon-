package πÈ¡ÿmath2;

import java.util.Scanner;

public class Math2_8 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		
		int min = w-x;
		
		if(h-y < min) {
			min = h-y;
		}
		
		if(x-0 < min) {
			min = x-0;
		}
		
		if(y-0 < min) {
			min = y-0;
		}
		
		System.out.println(min);
		
	}

}	


