package πÈ¡ÿstr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Str5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.toUpperCase();
		
		String[] split = str.split("");
	
		
		int count = 0;
		int max = 0;
		String maxalpa = "";
		
		for(int i=0; i < split.length; i++) {
			for(int j=0; j < split.length; j++) {
				if(!maxalpa.equals(split[i])) {
					if(split[i].equals(split[j])) {
						count++;
					}
				}
			}
			if(count > max) {
				max = count;
				maxalpa = split[i];
			} else if (count == max) {
				maxalpa = "?";
			}
			count = 0;
		}
		
		System.out.println(maxalpa);
	}
}

