package ����math2;

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
	            // 1�� num �ڽ� �ܿ� ���������� ���� �ִ��� �˻��� ���ǹ�
	            if (i % j == 0) {
	                // ���������� ���� ���� ��� isPrime�� ���� true�� �ٲ۴�.
	                isPrime = true;
	                // �� ���̶� �� ���ǹ��� ����� ��� num�� �Ҽ��� �ƴϹǷ� �ݺ����� �������´�
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
