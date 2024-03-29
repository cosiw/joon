package joon.section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main4_1 {

	/*
	 * 설명

학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.


입력
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.

두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.


출력
학급 회장으로 선택된 기호를 출력합니다.
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
			map.put(x, map.getOrDefault(x,0)+1); // map.put(key,value) key가 중복되면 덮어쓰기됨
		}
		
		System.out.println(map.containsKey('A')); // 'A'라는 키가 있냐 -> true or false
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
