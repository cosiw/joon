package joon;

import java.util.Scanner;

public class Main5 {
/*
	설명

	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

	특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


	입력
	첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


	출력
	첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
*/
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		
		String answer = "";		
		
		char [] s  = str.toCharArray();
		
		int lt = 0;
		int rt = str.length()-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		
		}
		
		answer = String.valueOf(s);
		
		/*
		char a[] = str.toCharArray();
		
		for(int i = 0 ; i<a.length; i++) {
			if(Character.isLowerCase(a[i]) || Character.isUpperCase(a[i])) {
				char tmp = a[i];
				a[i] = a[a.length-i-1];
				a[a.length-i-1] = tmp;
				System.out.println(a[i]);
			}
			if(!(Character.isLowerCase(a[i]) || Character.isUpperCase(a[i])) )
				answer += a[i];
			else if(i<a.length/2 && (Character.isLowerCase(a[i]) || Character.isUpperCase(a[i])))
				answer += a[i];
			else 
				answer += a[a.length-i-1];
			
		}
		*/
		
		return answer;
	}
}
