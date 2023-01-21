package joon.section2;

import java.util.Scanner;

public class Main2_8 {
/*
	����

	N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.

	���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.

	�� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.


	�Է�
	ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.


	���
	�Էµ� ������� ����� ����Ѵ�.
	*/
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr [] = new int [n];
		
		for(int i=0; i<n; i++)
			arr[i] = kb.nextInt();
		
		for(int s : solution(n,arr))
		System.out.print(s + " ");

	}
	
	public static int [] solution(int n, int arr[]) {
		
		int [] answer = new int[n];
		
		for(int i =0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) cnt++;
			}
			
			answer[i] = cnt;
		}
		int rank = 1;
		/*
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				if(arr[i]< arr[j]) {
					rank++;
				}
				answer[i] = rank;
				
			}
			rank = 1;
		}
		*/
		
		
		return answer;
		
	}

}
