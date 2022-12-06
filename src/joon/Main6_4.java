package joon;

import java.util.Scanner;

public class Main6_4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int s = kb.nextInt();
		int n = kb.nextInt();
		
		int [] arr = new int [n];
		
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		for(int x : solution(s,n,arr))
		System.out.print(x + " ");
	}
	
	public static int [] solution(int s, int n, int arr[]) {
		int [] answer = new int [s];
		boolean flag = false;
		
		for(int i =0; i<n; i++) {
			int j = 0;
			for(j=0; j<s; j++) {
				if(answer[j] != arr[i]) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag) {
				for(int k=s-2; k>=0; k--) answer[k+1] = answer[k];
				answer[0] = arr[i];
			} else {
				for(int k=j-1; k>=0; k--) answer[k+1] = answer[k];
				answer[0] = arr[i];
			}
			/*
			for(int x : answer)
				System.out.print(x + " ");
			
			System.out.println();
			*/
			
		}
		
		/*
		for(int x : arr) {
			int pos = -1; // À§Ä¡
			for(int i = 0; i<s; i++) if(x==answer[i]) pos = i;
			if(pos == -1) {
				for(int i=s-1; i>=1; i--) {
					answer[i] = answer[i-1];
				}

			} else {
				for(int i=pos; i>=1; i--) {
					answer[i] = answer[i-1];
				}
			}
			answer[0] = x;
		}
		*/
		return answer;
		
	}

}
