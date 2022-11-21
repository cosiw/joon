package joon;

import java.util.Scanner;

public class Main3_3 {

	/*
	 * ����

������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.

���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�

12 1511 20 2510 20 19 13 15

���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.

�������� ������ �����ּ���.


�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.

�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.


���
ù �ٿ� �ִ� ������� ����մϴ�.
	 */
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++)
			arr[i] = kb.nextInt();
		
		System.out.println(solution(n,k,arr));

	}
	
	public static int solution(int n, int k, int arr[]) {
		int answer=0;

		/*
		int a = 0;
		int sum = 0;
		while(a < n-2) {
			sum = 0;
			for(int i=a; i<k+a; i++) {
				sum += arr[i];
			}
			if(sum > answer) answer = sum;
			
			a++;
		}
		*/
		int sum = 0;
		
		for(int i=0; i<k; i++)
			sum += arr[i];
		
		answer = sum;
		
		
		for(int i =k; i<n; i++) {
			
			sum += (arr[i] -arr[i-k]);
			answer = Math.max(answer, sum);

		}
		
		return answer;
	}

}
