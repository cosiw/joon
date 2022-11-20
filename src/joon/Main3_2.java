package joon;

import java.util.*;
import java.util.Scanner;

public class Main3_2 {

	/*
	 	����

		A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		
		�Է�
		ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.
		
		�� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
		
		�� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.
		
		�� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
		
		�� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.
		
		
		���
		�� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.
	 
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int a [] = new int[n];
		for(int i=0; i<n; i++)
			a[i] = kb.nextInt();
		
		int m = kb.nextInt();
		int b [] = new int[m];
		for(int i=0; i<m; i++)
			b[i] = kb.nextInt();

		for(int x : solution(n,m,a,b))
		System.out.print(x + " ");
	}
	
	public static ArrayList<Integer> solution(int n, int m, int a[], int b[]){
	
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1 = 0, p2 = 0;
		
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1] < b[p2]) p1++;
			else p2++;
		}
		
		/*
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i] == b[j]) {
					answer.add(a[i]);
					break;
				}
			}
		}
		int tmp = 0;
		for(int i=0; i<answer.size()-1; i++) {
			for(int j=i+1; j<answer.size(); j++) {
				if(answer.get(j) < answer.get(i)) {
					tmp = answer.get(j);
					answer.set(j, answer.get(i));
					answer.set(i, tmp);
					
				}
			}
		}
		*/
		return answer;
	}

}
