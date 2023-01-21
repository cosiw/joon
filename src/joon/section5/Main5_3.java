package joon.section5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main5_3 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int [][] board = new int [n][n];
		
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		int m = kb.nextInt();
		
		int [] moves = new int[m];
		for(int i=0; i<m; i++) moves[i] = kb.nextInt();
		System.out.println(solution(n,board,m,moves));

	}
	
	public static int solution(int n,int [][] board,int m,int [] moves) {
		int answer= 0;
		Stack<Integer> stack = new Stack<>();
		int tmp = 0;
		for(int s : moves) {
			for(int i=0; i<n; i++) {
				if(board[i][s-1] != 0) {
					tmp = board[i][s-1];
					
					board[i][s-1] = 0;
					if(!stack.isEmpty() && tmp == stack.peek()) {
						answer += 2;
						stack.pop();
					} else stack.push(tmp);
					break;
				}
				

			}
		}
		// stack.peek() -> 가장 상단에 있는 값을 나타냄 
		
		
		return answer;
	}

}
