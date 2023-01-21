package joon.section8;

import java.util.HashMap;
import java.util.Scanner;

public class Main8_3 {

	static int n, m, tisum =0, scSum=0, answer = 0;

	public static void DFS(int L, int tisum, int scSum, int [] scArr, int[] tiArr) {
			
		if(tisum > m) return;
		
			if(L == n) {
				answer =Math.max(answer, scSum);
				
			}else {
				DFS(L+1, tisum+tiArr[L], scSum+scArr[L], scArr, tiArr);
				DFS(L+1, tisum, scSum, scArr, tiArr);
			}

	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		// 문제 개수
		n =kb.nextInt();
		
		// 제한 시간
		m =kb.nextInt();
		
		int [] sArr, tArr;
		sArr = new int[n];
		tArr = new int[n];
		
		for(int i =0; i<n; i++) {
			sArr[i] = kb.nextInt();
			tArr[i] = kb.nextInt();
		}
		
		DFS(0,0,0,sArr,tArr);
		System.out.println(answer);

	}

}
