package joon;

import java.util.ArrayList;
import java.util.Scanner;
/*
����

������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.

�� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�.

�� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.

�� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�.

�� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.


���
������������ ���ĵ� �迭�� ����մϴ�.
*/
public class Main3_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int b[] = new int[m];
		
		for(int i=0; i<m; i++)
		{
			b[i] = kb.nextInt();
		}
		
		for(int x : solution(n,m,a,b)) System.out.print(x + " ");

	}
	
	public static ArrayList<Integer> solution(int n, int m, int a[], int b[]) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1 = 0, p2 = 0;
		
		while(p1<n && p2<m) {
			if(a[p1] < b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
			
		}
		
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		
		
		return answer;
	}

}