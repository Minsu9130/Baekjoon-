package �������;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive3 {

	static char arr[][];  // �Է¹޴� nũ�⸸ŭ 2���� �迭�� ����
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
	
		arr = new char[n][n];
		
		for(int i=0;i<arr.length;i++) {
			Arrays.fill(arr[i],' ');  // fill �޼ҵ�� ���޹��� �迭�� ����Ҹ�
			                                         // Ư�� ������ �ʱ�ȭ ���� arr �迭�� ' ' �� �� �־��ش�
		}
		
		Star(0, 0, n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	// 
	public static void Star (int x, int y, int n) {
		
		// ��� ȣ���� ���� �Ǵºκ�
		// N==1�̸� *�� �־��ְ� ����ȴ�.
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3; j++) {
				if(!(i == 1 && j == 1)) { // ��� �κ��� ���� ä��� �ȵǱ� ������ i ==1 && j == 1 �ΰ�츦 ȣ������ �ʵ��� ����
					Star(x+i*(n/3), y+j*(n/3), n/3);
				}
			}
		}
	}
}
