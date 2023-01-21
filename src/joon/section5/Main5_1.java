package joon.section5;

import java.util.Scanner;
import java.util.Stack;

public class Main5_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next();

		System.out.println(solution(a));
	}
	
	public static String solution(String str) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop(); //상단에 있는걸 꺼낸다.
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}

}
