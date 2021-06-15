package πÈ¡ÿstr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Str5_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.toUpperCase();
	
		int[] arr = new int[26];
		
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int n = (int)ch;
			arr[n-65]++;
		}
		
		int max = arr[0];
		char maxalpa = (char)(65);
		
 		for(int i=1; i < arr.length; i++) {
			if(max < arr[i] ) {
				max = arr[i];
				maxalpa = (char)(i+65);
			} else if (arr[i] == max) {
				maxalpa = '?';
			}
		}
 		
 		System.out.println(maxalpa);
	}
}

