package joon.section1;

import java.util.Scanner;

/*
����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
*/
public class Main7 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		String answer ="NO";
		
		// ���� § �ڵ�
		/*
		char s [] = str.toCharArray();
		int lt = 0;
		int rt = s.length-1;
		
		while(lt<rt) {

			if(Character.toUpperCase(s[lt]) == Character.toUpperCase(s[rt])) answer = "YES";
			else {
				
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		*/
		
		// ���� �ڵ� 1
		/*
		int len = str.length();
		str = str.toUpperCase();
		
		for(int i =0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}
		*/
		
		// ���� �ڵ� 2
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}
}
