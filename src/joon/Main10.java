package joon;

import java.util.ArrayList;
import java.util.Scanner;

/*
����

�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.

���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.
*/
public class Main10 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		for(int x : solution(str, c)) {
			System.out.print(x+ " ");
		}
		
	}
	
	public static int [] solution(String s, char t) {
		int [] answer = new int[s.length()];
		
		int p =1000;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == t) {
				p = 0;
			} else {
				p++;
				answer[i] = Math.min(p, answer[i]);
			}
		}
		
		/*
		int p = 1000;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == t) 
				p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
			
		}
		*/
		return answer;
	}

}
