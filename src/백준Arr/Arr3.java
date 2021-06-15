package πÈ¡ÿArr;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int mul = x*y*z;
		int[] arr = new int[10];
		
		String mulstr = Integer.toString(mul);

		String[] strArray = mulstr.split("");
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < strArray.length; j++) {
				if(i == Integer.parseInt(strArray[j])) {
					arr[i]++;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		input.close();
	}

}
