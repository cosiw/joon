package joon.section6;

import java.util.Scanner;

public class Main6_1 {

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
		for(int i=0; i<n-1; i++) {
			int idx =i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[idx]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	
		/*
		int [] answer = new int[n];
		
		int tmp = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;					
				}
			}
		}
		
		for(int i=0; i<arr.length;i++)
			answer[i] = arr[i];
		
		return answer;
		*/
	}
	
}
