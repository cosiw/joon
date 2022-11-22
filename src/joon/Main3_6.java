package joon;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����

0�� 1�� ������ ���̰� N�� ������ �־����ϴ�. �������� �� �������� �ִ� k���� 0�� 1�� ������ �� �ֽ��ϴ�. �������� �ִ� k���� ������ ���� �� �������� 1�θ� ������ �ִ� ������ ���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.

���� ���̰� ���̰� 14�� ������ ���� ������ �־����� k=2���

1 1 0 0 1 1 0 1 1 0 1 1 0 1

�������� ���� �� �ִ� 1�� ���ӵ� ���Ӻκм�����

Image1.jpg

�̸� �� ���̴� 8�Դϴ�.


�Է�
ù ��° �ٿ� ������ ������ �ڿ��� N(5<=N<100,000)�� �־����ϴ�.

�� ��° �ٿ� N������ 0�� 1�� ������ ������ �־����ϴ�.


���
ù �ٿ� �ִ� ���̸� ����ϼ���.
 */
public class Main3_6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int [] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = kb.nextInt();
		
		System.out.println(solution(n,k,arr));

	}
	
	public static int solution(int n, int k, int arr[]) {
		int answer = 0, cnt = 0, lt = 0;
		                    
		for(int rt =0 ; rt<n; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt>k) {
				if(arr[lt] == 0) cnt --;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}

}
