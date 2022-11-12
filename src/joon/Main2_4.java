package joon;

import java.util.Scanner;

public class Main2_4 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		for(int x : solution(n)) {
			System.out.print(x + " ");
		}
		
		solution1(n);
	}
	
	public static int[] solution(int n) {
		int [] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		/*
		for(int i=1; i<n-1; i++) {
			answer[i+1] = answer[i-1] + answer[i];
		}
		*/
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}
	
	public static void solution1(int n) {
		int a = 1, b = 1 , c;
		System.out.println(a+ " " + b + " ");
		for(int i =2; i<n; i++) {
			c = a+b;
			System.out.println(c + " ");
			a = b;
			b = c;
		}
	}

}
