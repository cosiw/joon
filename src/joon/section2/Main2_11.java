package joon.section2;

import java.util.Scanner;

public class Main2_11 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		/*
		 * int arr[][] = new int[n][5];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		*/
		
		int arr[][] = new int[n+1][6];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(solution(n,arr));

	}
	
	public static int solution(int n, int arr[][]) {
		
		/*
		int answer = 1;
		
		int cnt = 0;
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<n; k++) {
					if(i != k && arr[i][j] == arr[k][j] ) {
						cnt++;
						break;
					}
				}
			}
			System.out.println("cnt : " + cnt);
			if(max < cnt) {
				max = cnt;
				answer = i+1;
			}
			cnt = 0;
		}
		*/
		
		int answer= 0, max =Integer.MIN_VALUE;
		
		for(int i=1; i<=n; i++) {
			int cnt = 0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max=cnt;
				answer = i;
			}
		}
		
		
		
		return answer;
	}

}
