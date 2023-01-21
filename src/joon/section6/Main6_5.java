package joon.section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main6_5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(solution(n, arr));
	}
	
	public static char solution(int n, int arr[]) {
		char answer = 'U';
		int cnt = 0;
		/*
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) return 'D';
			}
		}
		*/
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1]) return 'D';
		}
		
		
		return answer;
	}

}
