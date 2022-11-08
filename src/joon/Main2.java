package joon;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		/*
		대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


		입력
		첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

		문자열은 영어 알파벳으로만 구성되어 있습니다.


		출력
		첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String answer = "";
		char [] b = new char[a.length()];
		for(int i =0; i<a.length(); i++) {
			if(97<=a.charAt(i) && a.charAt(i) <=122) {
				 b[i] = Character.toUpperCase(a.charAt(i));
			} else if (65<=a.charAt(i) && a.charAt(i)<=90) {
				 b[i] = Character.toLowerCase(a.charAt(i));
			}
			
			answer = answer + b[i];
		}
		
		System.out.println(answer);
		*/
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
			
		
	}
	
	public String solution(String str) {
		String answer ="";
		for(char x : str.toCharArray()) {
			// if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			// else answer +=Character.toLowerCase(x);
			
			if(x>=97 && x<=122) answer += (char)(x-32);
			else answer += (char)(x+32);
		}
		return answer;
	}
	
}
