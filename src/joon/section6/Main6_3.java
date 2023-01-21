package joon.section6;

import java.util.Scanner;

public class Main6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//»ðÀÔ Á¤·Ä
		int tmp = 0;
		
		for(int i =1; i<n; i++) {
			tmp = arr[i]; int j=0;
			for(j=i-1; j>=0; j--) {
				if(arr[j] > tmp) {
					arr[j+1] = arr[j];
				} else break;
				
			}
			arr[j+1] = tmp;
		}
		return arr;

	}

}
