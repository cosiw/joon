package joon;

import java.util.Scanner;

public class Main3_5 {

	/*
	 * ����

N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.

���� N=15�̸�

7+8=15

4+5+6=15

1+2+3+4+5=15

�� ���� �� 3������ ��찡 �����Ѵ�.


�Է�
ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.


���
ù �ٿ� �� ������ ����մϴ�.
	 */
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		System.out.println(solution(n));

	}
	
	public static int solution(int n) {
		int answer = 0;
		int sum = 0;
		/*
		int lt = 1;
		int rt = 1;
		
		for(int i =1; i<n; i++) {
			if(sum < n) {
				sum += rt++;
			}
			else if(sum == n) {
				sum -=lt;
				lt++;
				answer++;
			} else {
				sum -=lt;
				lt++;
				i--;
				
			}
		}
		*/
		int lt =0;
		int m= n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) arr[i] = i+1;
		
		for(int rt =0; rt<m; rt++) {
			sum += arr[rt];
			if(sum== n) answer++;
			while(sum >=n) {
				sum -= arr[lt++];
				if(sum==n) answer++;
			}
		}
		
		return answer;
	}

}
