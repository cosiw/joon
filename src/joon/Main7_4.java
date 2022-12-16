package joon;

import java.util.Scanner;

public class Main7_4 {

	static int[] fibo;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		fibo = new int[a+1]; // 인덱스 1부터 사용
		DFS1(a);
		for(int i =1; i<=a; i++) System.out.print(fibo[i] + " ");

	}
	/*
	public static int DFS(int a) {
		if(a==1) return 1;
		else if(a==2) return 1;
		else {
			return DFS(a-2) + DFS(a-1);
		}
	}
*/
	
	public static int DFS1(int n) {
		if(fibo[n] > 0) return fibo[n]; //메모리제이션
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS1(n-2) + DFS1(n-1);
		
	}
}
