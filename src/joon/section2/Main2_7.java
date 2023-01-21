package joon.section2;

import java.util.Scanner;

public class Main2_7 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int arr [] = new int[n];
		
		for(int i =0; i<n; i++)
			arr[i] = kb.nextInt();
		
		System.out.println(solution(n, arr));

	}
	
	public static int solution(int n, int [] arr) {
		int answer = 0;
		
		int cnt = 0;
		int res [] = new int [n];
		
		for(int i =0; i<n; i++) {
			if(arr[i] == 1) {
				cnt++;
				res[i] = cnt;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		
		/*
		for(int i= 0; i<res.length; i++) {
			answer = answer+res[i];
		}
		*/
		return answer;
	}

}
