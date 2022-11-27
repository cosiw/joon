package joon;

import java.util.Scanner;
import java.util.Stack;

public class Main5_4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next();
		
		System.out.println(solution(a));
	}
	
	public static int solution(String a) {
		int answer = 0;
		int lt = 0;
		int rt = 0;
		
		Stack<Integer> stack = new Stack<>();
		for(char s : a.toCharArray()) {
			if(Character.isDigit(s)) {
				stack.push(s-48);
			}else {
				rt = stack.pop();
				lt = stack.pop();
				if(s=='+') stack.push(lt+rt);
				else if(s=='-') stack.push(lt-rt);
				else if(s=='*') stack.push(lt*rt);
				else if(s=='/') stack.push(lt/rt);
			}
		}
		
		answer = stack.get(0);
		
		
		
		return answer;
	}
	

}
