package joon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main7_13 {

	static ArrayList<ArrayList<Integer>> graph;
	static int [] ch;
	static int n, m, answer;
	public static void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv: graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
			
		}
	}
	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<=n; i++)
			graph.add(new ArrayList<>());
		
		for(int i =0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			graph.get(a).add(b);
		}
		ch[1]= 1;
		DFS(1);
		
		

	}

}
