package joon.section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main4_1 {

	/*
	 * ����

�б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.

��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������ �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.

�������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.


�Է�
ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.

�� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.


���
�б� ȸ������ ���õ� ��ȣ�� ����մϴ�.
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		String str = kb.next();
		
		
		
		System.out.println(solution(n, str));

	}
	
	public static char solution(int n, String s) {
		char answer = ' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1); // map.put(key,value) key�� �ߺ��Ǹ� ������
		}
		
		System.out.println(map.containsKey('A')); // 'A'��� Ű�� �ֳ� -> true or false
		System.out.println(map.size());
		System.out.println(map.remove('A'));
		System.out.println(map.size());
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			//System.out.println(x + " " + map.get(x));
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}

}
