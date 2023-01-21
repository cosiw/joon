package joon.section1;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution1(str));
	}
	
	public static int solution(String str) {
		int answer = 0;
		String answer1 = "";
		
		// '0' : 48 '9' : 57
		for(char x : str.toCharArray()) {
			//if(x>=48 && x<=57) answer = answer*10 + (x-48);
			if(Character.isDigit(x)) answer1 = answer1 +=x;
		}
		
		
		// String tmp = new StringBuilder(str).toString().replaceAll("[^0-9]", "");
		
		// answer = Integer.parseInt(tmp);
		return Integer.parseInt(answer1);
	}
	
	public static int solution1(String str) {
		int answer = 0;
	
		for(char s : str.toCharArray()) {
			if(s>=48 && s<=57) answer = answer*10 + (s-48);
		}
		
		return answer;
	}

}
