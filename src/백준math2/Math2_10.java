package πÈ¡ÿmath2;

import java.util.Scanner;

public class Math2_10 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] four_x = new int[1001];
		int[] four_y = new int[1001];
		
		
		for(int i=0; i < 3; i++) {
			int x = input.nextInt();
			int y = input.nextInt();

			four_x[x]++;
			four_y[y]++;
		}
		
		for(int i=0; i <four_x.length; i++) {
			if(four_x[i] == 1) {
				System.out.print(i + " ");
				break;
			}
		}
		
		for(int i=0; i <four_y.length; i++) {
			if(four_y[i] == 1) {
				System.out.print(i + " ");
				break;
			}
		}
		
	}

}	


