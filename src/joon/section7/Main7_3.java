package joon.section7;

import java.util.Scanner;

public class Main7_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		System.out.println(DFS2(a));
		
	}
	/*
	public static int DFS(int a) {
		
		if(a == 1) {
			return a;
		}
		else {
			
			a*=DFS(a-1);
			return a;
			
		}
	}
	*/
	
	public static int DFS2(int n) {
		if(n==1) return 1;
		else return n*DFS2(n-1);
	}

}
