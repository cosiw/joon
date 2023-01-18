package joon;

import java.util.Scanner;

public class Main8_13 {

	static int n;
	static int dx[] = {-1,0,1,-1,1,-1,0,-1};
	static int dy[] = {-1,-1,-1,0,0,1,1,1};
	//(-1,-1), (0,-1), (1,-1), (-1,0), (1,0), (-1,1), (0,1), (-1,1)
	//(-1,0), (-1,1), (0,1), (1,0), (1,-1) (0,-1), (-1,-1)
	static int answer = 0;
	public static void main(String[] args) {
		
		Scanner kb =new Scanner(System.in);
		n = kb.nextInt();
		
		int [][]arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}

		}
		
		solution(arr); // 저번 BFS랑 다르게 값을 다 넣고 DFS를 돌려야됨
		System.out.println(answer);
	}
	
	
	public static void DFS(int x, int y, int[][] board) {
		for(int i=0; i<8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx,ny,board);
			}
		}
	}
	public static void solution(int[][] board) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					DFS(i, j, board);
				}
			}
		}
	}
	

}
	




/*
public static void DFS(int x, int y, int board[][]) {
	boolean flag = false;
	board[x][y] = 0;
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			System.out.print(board[i][j] + " ");
			}System.out.println();
		}
	for(int i=0; i<8; i++) {
		int nx = x+dx[i];
		int ny = y+dy[i];
		if(nx>=0 && ny >=0 && nx <=6 && ny <=6 && board[nx][ny] == 1) {
			board[nx][ny] = 0;
			DFS(nx,ny, board);
		}else return;
	}
	
}
*/

