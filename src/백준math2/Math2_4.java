package 백준math2;

import java.util.Scanner;

public class Math2_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int M = input.nextInt();
		int N = input.nextInt();
        
		boolean prime[] = new boolean[N];
        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;
        
        for(int i=2; i*i<=N; i++){
        	// prime[i]가 소수라면
            if(!prime[i]){
            	// prime[j] 소수가 아닌 표시
            	for(int j=i*i; j<=N; j+=i) prime[j] = true;                
            }        
        }    
        
        // 소수 출력
        for(int i=M; i<=N;i++){
        	if(!prime[i]) System.out.print(i+" ");        
        }
        
    }
}
 
