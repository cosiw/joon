package joon;

import java.util.Scanner;

/*
����

�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�
*/
public class Main6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		String answer ="";
		
		for(int i =0; i<str.length(); i++) {
			//System.out.println(str.charAt(i)+" " + i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		/*
		char s [] = str.toCharArray();
		
		for(int i=0; i<s.length; i++) {
			boolean flag = false;
			for(int j=0; j<s.length; j++) {
				if(i>j && s[i] == s[j]) {
					flag = true;
				}
				
			}
			if(!flag)
			answer += s[i];
		}
		*/
		return answer;
	}
}
