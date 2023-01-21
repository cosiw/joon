package joon.section2;

import java.util.ArrayList;
import java.util.Scanner;
/*
����

5*5 �����ǿ� �Ʒ��� ���� ���ڰ� �����ֽ��ϴ�.

Image1.jpg

N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.


�Է�
ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)

�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.


���
�ִ����� ����մϴ�.
*/
public class Main2_9 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr [][] = new int [n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(solution(n,arr));

	}
	
	public static int solution(int n,int arr[][]) {
		int answer=0;
		// 2*2 6
		// 3*3 8
		// 4*4 10
		
		int sum1, sum2;
		
		for(int i=0; i<n; i++) {
			sum1 = sum2 =0;
			for(int j=0; j<n; j++) {
				sum1 +=arr[i][j];
				sum2 +=arr[j][i];
				
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1= sum2 = 0;
		for(int i = 0; i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		/*
		int [] sum = new int [2*n+2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sum[i] = sum[i] + arr[i][j];
				sum[i+n] = sum[i+n] + arr[j][i];
				if(i == j)
					sum[2*n] = sum[2*n] +arr[i][j];
				if(i+j == n-1)
					sum[1+2*n] = sum[1+2*n] + arr[i][j];
			}
		}
		
		answer = sum[0];
		for(int i=1; i<sum.length; i++) {
			if(answer < sum[i]) answer = sum[i];
		}
		*/
		return answer;
	}

}
