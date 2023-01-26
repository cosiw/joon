package joon.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
	int pay, day;
	
	public Lecture(int pay, int day) {
		this.pay = pay;
		this.day = day;
	}

	@Override
	public int compareTo(Lecture o) {
		return o.day-this.day;
	}
	

}
public class Main9_4 {

	static int max = Integer.MIN_VALUE;
	static int n;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i =0; i<n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m,d));
			if(d>max) max = d;
		}
		System.out.println(solution(arr));
		
		
	}
	
	public static int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // poll을 할 경우 큰 값을 우선 순위로 함.
		
		Collections.sort(arr);
		int j=0;
		for(int i =max; i >=1; i--) {
			for(; j<n; j++) {
				if(arr.get(j).day < i) break;
				pQ.offer(arr.get(j).pay);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		return answer;
	}
	

}
