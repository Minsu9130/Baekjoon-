package πÈ¡ÿmath2;

import java.util.Scanner;

public class Math2_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();

		for (int i = 2; i <= N; i++) {
            
            while (true) {
            	
            	if(N%i == 0) {
            		N = N/i;
            		System.out.println(i);
            	}
            	
            	if(N%i != 0)
            		break;
            }
        }
	}
	
}
