package joon;

import java.util.Scanner;

/*
����

���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�

���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� ����� ���ڿ��� ����Ѵ�.
 */
public class Main11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();

		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		String answer="";
		
		str = str+ " ";
		int cnt = 1;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			} else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
					
			}
		}
		/*
		char a [] = str.toCharArray();
		
		int cnt = 1;
		
		answer = answer +a[0];
		for(int i =0; i<a.length-1;i++) {
			if(a[i] == a[i+1]) {
				cnt++;
			} else {
				if(cnt != 1)
				answer += cnt;
				answer += a[i+1];
				cnt = 1;
			}
						
		}
		if(a[a.length-2] == a[a.length-1])
			answer = answer + cnt;
		
		*/
		
		
		return answer;
	}

}
