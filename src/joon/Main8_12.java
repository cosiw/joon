package joon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class PointB{
	int x;
	int y;
	public PointB(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main8_12 {

	static int n , m;
	static int tomato[][];
	static int [][] dis;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int count = 0;
	static Queue<PointB> q = new LinkedList<>();
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();

		boolean flag = true;
		tomato = new int[n][m];
		dis = new int[n][m];
		for(int i=1; i<n; i++) {
			for(int j=1; j<m; j++) {
				tomato[i][j] = kb.nextInt();
				if(tomato[i][j] == 1) {
					q.offer(new PointB(i, j)); //출발점이 여러개 일 때 Q에 미리 넣어둬라  
				}
			}
		}
		BFS();
		
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(tomato[i][j] == 0) flag =false;
			}
		}
		if(flag) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
		}
		
		
	}
	
	public static void BFS() {

		while(!q.isEmpty()) {
			PointB tmp = q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+ dx[i];
				int ny = tmp.y+ dy[i];
				q.poll();
				if(nx >= 0 && ny >=0 && ny <m && nx <n && tomato[nx][ny] == 0) {
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
					tomato[nx][ny] = 1;
					q.offer(new PointB(nx,ny));
				}
			}
		}
	}

}











