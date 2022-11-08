package joon;

import java.util.Scanner;

public class Main{
	public int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		//System.out.println(str + " " + t);
		/*
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == t) answer++;
		}*/
		
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
			
		return answer;
	}
    public static void main(String[] args){

    	Main T = new Main();
    	Scanner kb = new Scanner(System.in);
    	
    	String str  = kb.next();
    	char c = kb.next().charAt(0);
    	
    	System.out.print(T.solution(str, c));
    	/*
       Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   char ch = sc.next().charAt(0);
	   int cnt = 0;
	   str = str.toUpperCase();
	   ch = Character.toUpperCase(ch);
	   
	   for(int i =0; i<str.length(); i++) {
		   if(str.charAt(i) == ch) {
			   cnt++;
		   }
	   }
	   
	   System.out.println(cnt);
*/
    }
       

}