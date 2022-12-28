package joon;

import java.util.Scanner;

public class Main8_2 {

	static int c;
	static int n;
	
	static int sum = 0;
	static int answer = 0;
	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		c = kb.nextInt();
		n = kb.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		DFS(0,0,arr);
		System.out.println(answer);
		
	}
	
	public static void DFS(int L, int sum, int arr[]) {
		if(sum>c) return;
		if(L==n) {
			answer=Math.max(answer, sum);
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}

}
