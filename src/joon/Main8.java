package joon;

import java.util.Scanner;
/*
����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.

���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.

�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.

���ĺ� �̿��� ���ڵ��� �����մϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
*/
public class Main8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		System.out.println(solution(str));
		
	}
	
	public static String solution(String str) {
		
		/*
		String answer = "NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		*/
		
		//String answer="YES";
		
		/*
		str = str.toUpperCase();
		char [] s = str.toCharArray();
		
		for(int i=0; i<s.length;i++) {
			if(Character.isAlphabetic(s[i])) {
				if(s[i] != s[s.length-1-i]) {
					return "NO";
				}
					
			}
		}
		*/
		
		String answer = "YES";
		
		str=str.toUpperCase().replaceAll("[^A-Z]","");
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(!str.equals(tmp))
			answer = "NO";
		

		return answer;
	}
}
