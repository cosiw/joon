package joon;

import java.util.Scanner;


/*
A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.

����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.

���� ��� N=5�̸�


�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.

�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.

�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.


���
�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.
*/
public class Main2_3 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();
		
		int [] a = new int[num];
		int [] b = new int[num];
		
		for(int i=0; i<num;i++) {
			a[i] = kb.nextInt();
		}
		
		for(int i=0; i<num;i++) {
			b[i] = kb.nextInt();
		}
		
		for(char x : solution(num, a, b).toCharArray())
		System.out.println(x);


	}
	
	public static String solution(int n, int [] a, int [] b) {
		String answer ="";
		
		for(int i=0; i<n; i++) {
			if(a[i] == b[i]) answer +="D";
			else if((a[i] > b[i] && a[i] - b[i] == 1) || (a[i]<b[i] && b[i]-a[i] == 2)) answer += "A";
			else answer += "B";
				
		}
		
		/*
		for(int i=0; i<n; i++) {
			if(a[i] == b[i]) answer +="D";
			else if(a[i]==1 && b[i]==3) answer+="A";
			else if(a[i]==2 && b[i]==1) answer+="A";
			else if(a[i]==3 && b[i]==2) answer+="A";
			else answer += "B";
		}
		*/
		return answer;
	}

}
