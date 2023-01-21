package joon.section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		/*
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		String [] str = new String[n];
		String [] answer = new String[n];
		for(int i = 0; i<n; i++) {
			str[i] = kb.next();
			answer[i] = "";
			for(int j=0; j<str[i].length(); j++) {
				answer[i] += str[i].charAt(str[i].length()-j-1);
			}
			
			System.out.println(answer[i]);
		}
		*/
		
		Main4 T = new Main4();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
				
		
	}

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		/*
		for(String x : str) {
			//StringBuilder는 객체를 여러개 만들지 않음
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		*/
		
		//String tmp = "";
		
		/*
		for(String x : str) {
			char[] s = x.toCharArray();
			if(s.length % 2 ==1) {
				for(int i =0; i<s.length/2-1; i++) {
					char c = s[i];
					s[i] = s[s.length-i-1];
					s[s.length-i-1] = c;
				}
			} else {
				for(int i = 0; i<s.length/2; i++) {
					char c = s[i];
					s[i] = s[s.length-i-1];
					s[s.length-i-1] = c;

				}
			}
			for(int i = 0; i<s.length; i++)
			tmp += s[i];
			

		}
		answer.add(tmp);
		
		*/
		
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt=0, rt = x.length()-1;
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String ans = String.valueOf(s);
			answer.add(ans);
		}
		
		return answer;
		
	}

}
