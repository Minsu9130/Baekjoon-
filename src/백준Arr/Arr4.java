package ¹éÁØArr;

import java.util.Scanner;

public class  Arr4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = input.nextInt();
		}
		
		int[] mod = new int[42];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < mod.length; j++) {
				if(arr[i]%42 == j) {
					mod[j]++;
				}
			}
		}
		
		int count = 0;
		
		for(int i=0; i < mod.length; i++) {
			if(mod[i] != 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		input.close();
	}

}
