package joon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main5_6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();

		System.out.println(solution(n,k));
	}
	
	public static int solution(int n, int k) {
		int answer = 0;
		/*
		 Queue<Integer> que = new LinkedList<>();
		for(int i=1; i<=n; i++)
				que.add(i);
		
		int i = 1;

		while(que.size() != 1) {

			if(i%k != 0) 	que.add(que.poll());
			else System.out.println(que.poll());
			
			i++;
			
			System.out.println("que" + que);
		}
		
		answer= que.peek();
		*/
		
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1; i<=n; i++) Q.offer(i);
		while(!Q.isEmpty()) {
			for(int i =1; i<k; i++)	Q.offer(Q.poll());
			Q.poll();
			if(Q.size()==1) answer = Q.poll();
		}
		
		return answer;
	}

}
