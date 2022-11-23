package joon;

import java.util.HashMap;
import java.util.Scanner;

public class Main4_2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next();
		String b = kb.next();
		
		System.out.println(solution(a,b));
		
	}
	
	public static String solution(String a, String b) {
		/*
		String answer= "NO";
		
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(char s : a.toCharArray()) {
			map1.put(s, map1.getOrDefault(s, 0)+1);
		}
		
		for(char s : b.toCharArray()) {
			map2.put(s, map2.getOrDefault(s, 0)+1);
			if( map1.equals(map2))
				answer = "YES";
				
		}
		*/
		
		String answer = "YES";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for(char x : b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) return "NO";
			map.put(x, map.get(x)-1);
		}
		
		
		
		
		return answer;
	}

}
