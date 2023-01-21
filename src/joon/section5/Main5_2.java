package joon.section5;

import java.util.Scanner;
import java.util.Stack;

public class Main5_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		String answer ="";
		Stack<Character> stack = new Stack<>();

		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '('); // 꺼낸 값을 리턴받음!!!!!!!!!!!!
	
			}else stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
		}
		/*
		for(int rt=0; rt<str.length(); rt++) {
			stack.push(s[rt]);
			System.out.println(s[rt] == ')' && stack.contains('('));
			if(s[rt] == ')' && stack.contains('(')) {
				lst = stack.lastIndexOf('(');
				System.out.println(lst);
				System.out.println(rt-cnt);
				for(int j=lst; j<=rt-cnt; j++) {
					stack.pop();
					cnt++;
				}

			}

		}
		
		for(Character a : stack) System.out.print(a + " "); 
		*/
		
		
		return answer;
	}

}
