package joon;

import java.util.ArrayList;
import java.util.Scanner;

class PointD{
	int x, y;
	public PointD(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main8_15 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<PointD> pz, hs;
	
	public static void DFS(int L, int s) {
		if(L==m) {
			int sum =0; // 조합 경우에서 도시의 피자 배달 거리
			for(PointD h : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y-pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		}else {
			for(int i=s; i<len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		 n = kb.nextInt();
		 m = kb.nextInt();
		 pz = new ArrayList<>();
		 hs = new ArrayList<>();
		 
		 for(int i=1; i<n+1; i++) {
			 for(int j=1; j<n+1; j++) {
				 int tmp = kb.nextInt();
				 if(tmp==1) hs.add(new PointD(i, j));
				 else if(tmp==2) pz.add(new PointD(i, j));
			 }
		 }
		 
		 len = pz.size();
		 combi = new int[m];
		 DFS(0,0);
		 System.out.println(answer);
		 
	}
	


}
