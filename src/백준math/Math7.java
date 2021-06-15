package πÈ¡ÿmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math7 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int N  = T;
		int count = 0;
		int bag = 0;

		while (true) {

			N-=5;
			count++;

			if (N < 5) {
				break;
			}

			if (N%5 == 0) {
				bag = N/5 + count;
				break;
			}
			else if (N%3 == 0) {
				bag = N/3 + count;
				break;
			}
		}

		if (bag == 0 && T%3 == 0) 
			System.out.println(T/3);
		else if (bag != 0) 
			System.out.println(bag);
		else 
			System.out.println(-1);
		
		
	}

}
