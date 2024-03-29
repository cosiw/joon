package joon.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5_7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next();
		String b = kb.next();
		
		System.out.println(solution(a,b));
	}
	
	public static String solution(String a, String b) {
		/*
		String answer = "NO";
		
		Queue<Character> Q = new LinkedList<>();
		Queue<Character> K = new LinkedList<>();
		
		for(char x : a.toCharArray()) {
			K.offer(x);
		}
		
		for(char x : b.toCharArray()) {
			Q.offer(x);
		}
		
		while(Q.size() >0) {
			if(Q.poll()==K.peek()) K.poll();
		}
		if(K.size() == 0) answer = "YES"; 
		*/
		
		String answer = "YES";
		
		Queue<Character> Q = new LinkedList<>();
		for(char x : a.toCharArray()) Q.offer(x);
		for(char x : b.toCharArray()) {
			if(Q.contains(x)) {
				if(x!= Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		return answer;
	}

}
