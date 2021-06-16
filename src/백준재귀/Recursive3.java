package 백준재귀;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive3 {

	static char arr[][];  // 입력받는 n크기만큼 2차원 배열을 생성
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
	
		arr = new char[n][n];
		
		for(int i=0;i<arr.length;i++) {
			Arrays.fill(arr[i],' ');  // fill 메소드는 전달받은 배열의 모든요소를
			                                         // 특정 값으로 초기화 따라서 arr 배열을 ' ' 로 다 넣어준다
		}
		
		Star(0, 0, n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	// 
	public static void Star (int x, int y, int n) {
		
		// 재귀 호출이 종료 되는부분
		// N==1이면 *을 넣어주고 종료된다.
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3; j++) {
				if(!(i == 1 && j == 1)) { // 가운데 부분은 별을 채우면 안되기 때문에 i ==1 && j == 1 인경우를 호출하지 않도록 설정
					Star(x+i*(n/3), y+j*(n/3), n/3);
				}
			}
		}
	}
}
