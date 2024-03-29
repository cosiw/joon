package joon.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	public int time;
	public char state;
	
	public Time(int time, char state){
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Time o) {
		if(this.time==o.time) return this.state - o.state;
		return this.time - o.time;
	}
}

public class Main9_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int sT = kb.nextInt();
			int eT = kb.nextInt();
			
			
			arr.add(new Time(sT,'s'));
			arr.add(new Time(eT,'e'));
		}
		
		System.out.println(solution(arr));
		
	}
	
	public static int solution(ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for(Time ob : arr) {
			System.out.println(ob.time + " " + ob.state);
			if(ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(cnt, answer);
		}
		return answer;
	}

	
	
	
	
}




