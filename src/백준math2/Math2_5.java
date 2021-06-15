package 백준math2;

import java.util.Scanner;

public class Math2_5 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int M = input.nextInt();
		int N = input.nextInt();
		
		isPrime(N);
		
		for(int i=M; i <= N; i++){
        	if(prime[i] == false)
        		System.out.println(i);        
        }	
	}
	
	public static void isPrime(int N) {
		
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
		
		
	}

}	


