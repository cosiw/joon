package joon;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		/*
		�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.


		�Է�
		ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

		���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


		���
		ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
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
