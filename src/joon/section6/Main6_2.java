package joon.section6;

import java.util.Scanner;

public class Main6_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr [] = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : solution(n,arr))
		System.out.print(x+ " ");

	}
	
	public static int [] solution(int n, int [] arr) {
		// ���� ����: �̿��� �� ���� ���ؼ� ũ�⿡ ���� �ٲ��ִ� ��
		int tmp = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
					
				}
			}
		}
		return arr;

	}
}
