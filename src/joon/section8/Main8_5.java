package joon.section8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main8_5 {

	static int n, m, answer = Integer.MAX_VALUE;
	
	
	public static void DFS(int L, int sum, int [] arr) {
		if(sum >m) return;
		if(L>=answer) return;

		else {
			if(sum == m) {
				answer = L;
				return;
			}
			else {
				for(int i =n-1; i>=0; i--) {
					DFS(L+1, sum+arr[i], arr);
				}
			}
		}
		
		/*
		if(sum == m) {
			answer = Math.min(answer, L);
		} else {
			for(int i =0; i<n; i++) {
				DFS(L+1, sum+arr[i], arr);
			}
		}
		*/
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		
		//Integer a [] = new Integer [n];
		int a [] = new int [n];
		for(int i=0; i<n; i++) a[i] = kb.nextInt();
		
		//Arrays.sort(a, Collections.reverseOrder()); // 이걸 사용하려면 객체형(Integer)로 선언해야됨.
		m = kb.nextInt();
		
		DFS(0, 0, a);
		
		System.out.println(answer);
		
	}

}
