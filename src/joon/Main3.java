package joon;

import java.util.Scanner;

public class Main3 {
	/*
	����

	�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.

	������� �� �ܾ�� �������� ���е˴ϴ�.


	�Է�
	ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


	���
	ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��

	�ܾ ������ �մϴ�.
	 */
	public String solution(String str) {
		
		
		/*String [] a = str.split(" ");
		
		String answer = a[0];
		for(int i=0; i<a.length-1; i++) {
			if(answer.length() <a[i+1].length()) {
				answer = a[i+1];
				System.out.println(answer);
			}
		}
		*/
		
		String answer = "";
		/*
		int m = Integer.MIN_VALUE;
		
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		*/
		
		int m = Integer.MIN_VALUE, pos;
		/*
		while((pos=str.indexOf(' '))!= -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m=len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length()> m) answer = str;
		*/
		
		while((pos=str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);
			if(tmp.length() > m) {
				answer = tmp;
				m = tmp.length();
			}
			
			str = str.substring(pos+1);
		}
		if(str.length() > m) answer = str;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main3 T = new Main3();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}
}
