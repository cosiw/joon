package joon.section5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5_8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		int danger[] = new int [n]; 
		for(int i = 0; i<n; i++)
			danger[i] = kb.nextInt();
		Main5_8 T = new Main5_8();
		System.out.println(T.solution(n,m,danger));
	}
	
	public int solution(int n, int m, int [] danger) {
		int answer = 0;
		
		Queue<Person> Q = new LinkedList<>();
		
		for(int i = 0; i<n; i++) {
			Q.offer(new Person(i, danger[i]));
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority > tmp.priority) {
					Q.offer(tmp);
					tmp = null; 
					break;
				}
			}if(tmp != null) {
				answer++;
				if(tmp.id == m) return answer;
			}
		}
		/*
		Queue<HashMap<Integer,Integer>> Q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(Q.peek().get(i) < Q.peek().get(j)) {
					Q.offer(Q.poll());
				} else {
					cnt++;
					if(Q.poll().containsKey(m)) answer = cnt;
				}
			}
		}
		*/
		
		return answer;
	}
	class Person{
		int id;
		int priority;
		
		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}	

	
}

	