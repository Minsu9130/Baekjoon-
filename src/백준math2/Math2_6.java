package ����math2;

import java.util.Scanner;

public class Math2_6 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true) {
			int N = input.nextInt();
		
			if(N == 0) {
				break;
			}
			System.out.println(isPrime(2*N));
		}
	}
	
	public static int isPrime(int N) {
		
		prime = new boolean[N + 1];
		
		prime[0] = prime[1] =  true;
		
		for(int i=2; i <= Math.sqrt(N); i++) {
			if(prime[i]==true) {
				continue;
			}
			// i �� ������� �ɷ��ֱ� ���� �ݺ���
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


