package 백준math2;

import java.util.Scanner;

public class Math2_7 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int T = input.nextInt();
		
		while(T == 0) {
			int N = input.nextInt();
			
			T--;
		}
	}
	
	public static int isPrime(int N) {
		
		prime = new boolean[N + 1];
		
		prime[0] = prime[1] =  true;
		
		for(int i=2; i <= Math.sqrt(N); i++) {
			if(prime[i]==true) {
				continue;
			}
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j = i*i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
		
		int count = 0;
		
		for(int i=N/2 +1; i <= N; i++){
			if(prime[i] == false)
				count++;        
		}	
		
		return count;
	}

}	


