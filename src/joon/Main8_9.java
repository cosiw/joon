package joon;

import java.util.Scanner;

public class Main8_9 {

	static int n, m;
	static int [] arr;
	public static void DFS(int L, int s) {
		if(L==m) {
			for(int x: arr) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i =s; i<=n; i++) {
				arr[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		
		arr = new int[m];
		
		DFS(0, 1);
		
		

	}

}
