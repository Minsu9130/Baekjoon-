package ����math2;

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


