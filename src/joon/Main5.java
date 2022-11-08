package joon;

import java.util.Scanner;

public class Main5 {
/*
	����

	���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,

	Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.


	�Է�
	ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.


	���
	ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
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
