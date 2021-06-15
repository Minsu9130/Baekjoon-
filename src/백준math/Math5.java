package πÈ¡ÿmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int rn1;
			int rn2;
			
			if(N%H == 0) { 
				rn1 = H;
				rn2 = N/H;
			}
			else {
				rn1 = N%H;
				rn2 = N/H + 1;
			}
			
			if(rn2 < 10) {
				System.out.println(Integer.toString(rn1) + "0" + Integer.toString(rn2));
			}
			else {
				System.out.println(Integer.toString(rn1) + Integer.toString(rn2));
			}
			
		}
		
	}

}
