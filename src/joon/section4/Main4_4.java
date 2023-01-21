package joon.section4;

import java.util.HashMap;
import java.util.Scanner;

public class Main4_4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String S = kb.next();
		String T = kb.next();
		
		System.out.println(solution(S, T));
	}
	
	public static int solution(String S, String K) {
		int answer = 0;
		/*
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(Character c : K.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		
		int lt = 0;
		char [] arr = S.toCharArray();
		for(int rt =0 ; rt <S.length(); rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			if(rt+1 >= K.length()) {
				if(map.equals(map1)) answer ++;
				
				map.put(arr[lt], map.get(arr[lt]) - 1);
				if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
				lt++;
			}
			
			
		}
		*/
		
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for(char x : K.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) +1);
		int L = K.length()-1;
		for(int i = 0; i<L; i++) am.put(S.charAt(i), am.getOrDefault(S.charAt(i), 0) + 1);
		
		int lt =0;
		for(int rt = L; rt<S.length(); rt ++) {
			am.put(S.charAt(rt), am.getOrDefault(S.charAt(rt), 0) + 1);
			if(am.equals(bm)) answer ++;
			am.put(S.charAt(lt), am.get(S.charAt(lt ))-1);
			if(am.get(S.charAt(lt)) == 0) am.remove(S.charAt(lt));
			lt++;
		}
		return answer;
	}

}
