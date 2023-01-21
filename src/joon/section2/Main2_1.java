package joon.section2;

import java.util.ArrayList;
import java.util.Scanner;

/*
����

N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

(ù ��° ���� ������ ����Ѵ�)


�Է�
ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.


���
�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
*/
public class Main2_1 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int cnt = kb.nextInt();
		
		int [] num = new int [cnt];
		
		for(int i=0; i<num.length; i++)
			num[i] = kb.nextInt();
	
		for(int s : solution(num))
		System.out.print(s + " ");
		
	}
	
	public static ArrayList<Integer> solution (int [] num) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++) {
			if(i == 0) {
				answer.add(num[i]);
				continue;
			}
			if(num[i-1] < num[i]) {
				answer.add(num[i]);
			}
			
		}

		return answer;
		
	}

}
