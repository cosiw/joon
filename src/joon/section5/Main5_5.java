package joon.section5;

import java.util.Scanner;
import java.util.Stack;

public class Main5_5 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next();
		
		System.out.println(solution(a));

	}
	
	public static int solution(String a) {
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) == '(') stack.push(a.charAt(i));
			else {
				stack.pop();
				if(a.charAt(i-1) == '(') answer+=stack.size();
				else answer +=1;
			}
		}
		/*
		for(char x : a.toCharArray()) {
			if(x == '(') stack.push(x);
			else if (stack.peek()=='(' && x == ')') {
				stack.pop();
				answer += stack.size();
			}else if(stack.peek() == ')' && x == ')') {
				answer += 1;
				stack.pop();
			}

		}
		*/
		
		
		return answer;
	}

}
