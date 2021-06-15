package ����math2;

import java.util.Scanner;

public class Math2_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int M = input.nextInt();
		int N = input.nextInt();
        
		boolean prime[] = new boolean[N];
        // �Ҽ��� false
        // 1�� �Ҽ��� �ƴϹǷ� ����
        prime[0] = prime[1] = true;
        
        for(int i=2; i*i<=N; i++){
        	// prime[i]�� �Ҽ����
            if(!prime[i]){
            	// prime[j] �Ҽ��� �ƴ� ǥ��
            	for(int j=i*i; j<=N; j+=i) prime[j] = true;                
            }        
        }    
        
        // �Ҽ� ���
        for(int i=M; i<=N;i++){
        	if(!prime[i]) System.out.print(i+" ");        
        }
        
    }
}
 
