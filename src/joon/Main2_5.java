package joon;

import java.util.Scanner;
/*
����

�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.

���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.


�Է�
ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.


���
ù �ٿ� �Ҽ��� ������ ����մϴ�.
*/
public class Main2_5 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
	
		int num = kb.nextInt();
		
		System.out.println(solution(num));

	}
	
	public static int solution(int num) {
		int answer = 0;
		
		int [] ch = new int[num+1];
		for(int i=2; i<num; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j =i; j<num; j= j+i) {
					ch[j] = 1;
				}
			}
		}
		/*
		for(int i=2; i<=num; i++) {
			for(int j=1; j<num; j++) {
				if(i%j == 0) cnt++;
			}
			if(cnt == 2) answer++;
			cnt = 0;
		}
		*/
		
		//�����佺�׳׽� ü 1, 2, 3, 4 �Ҽ� üũ�ϰ� �� ������ ����� �� ���������� �Ҽ��� ����
		return answer;
	}

}
