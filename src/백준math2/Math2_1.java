package ����math2;

import java.util.Scanner;

public class Math2_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int T = input.nextInt();
		
		int count = 0;
		
		for(int i=0; i < T; i++) {
			int n = input.nextInt();
			
			boolean isPrime = false;
			if (n == 1)
				isPrime = true;
			
			for (int j = 2; j < n; j++) {
	            // 1�� num �ڽ� �ܿ� ���������� ���� �ִ��� �˻��� ���ǹ�
	            if (n % j == 0) {
	                // ���������� ���� ���� ��� isPrime�� ���� true�� �ٲ۴�.
	                isPrime = true;
	                // �� ���̶� �� ���ǹ��� ����� ��� num�� �Ҽ��� �ƴϹǷ� �ݺ����� �������´�
	            }
	        }
			
			if(!isPrime) 
				count++;
		}
		
		System.out.println(count);
	}
	
}
