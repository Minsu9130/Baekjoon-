package πÈ¡ÿstr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Str7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(Reverse(str1));
		int num2 = Integer.parseInt(Reverse(str2));
		
		if(num1 < num2)
			System.out.println(num2);
		else 
			System.out.println(num1);
	}

	public static String Reverse(String str) {
		String st = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			st = st + str.charAt(i);
		}
		return st;
	}
}
