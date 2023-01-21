package joon.section3;

import java.util.Scanner;


public class Main3_4 {

	/*
	 * ����

N���� ���� �̷���� ������ �־����ϴ�.

�� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.

���� N=8, M=6�̰� ������ ������ ���ٸ�

1 2 1 3 1 1 1 2

���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.


�Է�
ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����.

������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.


���
ù° �ٿ� ����� ���� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = kb.nextInt();
			
		
		System.out.println(solution(n,m,arr));

	}
	
	public static int solution(int n, int m, int arr[]) {
		int answer = 0;
		
		int sum = 0;
		int p = 0;
		int lt = 0;
		for(int rt =0; rt<n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		
		/*
		for(int i=0; i<n; i++) {

			if(sum < m) {
				sum += arr[i];
				if(i ==n-1 && sum == m) answer++;
			} else if(sum == m) {
				answer++;
				sum += arr[i];
			} else {
				sum -= arr[p];
				p++;
				i--;
			}
	
		}
		*/
		return answer;
	}

}
