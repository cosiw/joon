package joon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PointC{
	int x;
	int y;
	PointC(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Main8_14 {

	static int n;
	static int [] dx= {-1,0,1,-1,1,-1,0,1};
	static int [] dy= {-1,-1,-1,0,0,1,1,1};
	static int answer = 0;
	static Queue<PointC> q = new LinkedList<>();
	
	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		solution(arr);
		System.out.println(answer);
	
	}
	
	public static void BFS(int x, int y, int [][]arr) {
		q.offer(new PointC(x,y));
		
		while(!q.isEmpty()) {
			PointC tmp = q.poll();
			for(int i=0; i<8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && ny >= 0 && nx <n && ny < n && arr[nx][ny] == 1) {
					arr[nx][ny] = 0;
					q.offer(new PointC(nx,ny));
				}
			}
		}
	}
	
	public static void solution(int [][]arr) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 1) {
					answer++;
					arr[i][j] = 0;
					BFS(i,j, arr);
					
				}
			}
		}
	}
	
	
	

}
