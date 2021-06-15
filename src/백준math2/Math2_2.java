package 백준math2;

import java.util.Scanner;

public class Math2_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int M = input.nextInt();
		int N = input.nextInt();
		
		int sum = 0;
		int min = N;
		
		for(int i=M; i <= N; i++) {
			boolean isPrime = false;
			if (i == 1)
				isPrime = true;
			
			for (int j = 2; j < i; j++) {
	            // 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
	            if (i % j == 0) {
	                // 나누어지는 수가 있을 경우 isPrime의 값을 true로 바꾼다.
	                isPrime = true;
	                // 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다
	            }
	        }
			
			if(!isPrime) {
				sum+=i;
				if(i < min) 
					min = i;
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
	}
	
}
