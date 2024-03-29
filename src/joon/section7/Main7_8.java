package joon.section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7_8 {

	Node root;
	
	int dis [] = {1, -1, 5};
	int ch [];
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e) {
		ch= new int[10001];
		ch[s] = 1; // 이전에 방문한 곳 저장
		Q.offer(s);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len =Q.size();
			for(int i=0; i<len; i++) {
				int x = Q.poll();
				//if(x == e) return L;
				for(int j=0; j<3; j++) {
					int nx=x+dis[j];
					if(nx==e) return L+1; 
					if(nx>=1 && nx <=10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		Main7_8 T = new Main7_8();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		
		System.out.println(T.BFS(s, e));

	}

}
