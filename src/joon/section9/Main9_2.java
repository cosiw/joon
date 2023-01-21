package joon.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meet implements Comparable<Meet>{
	int st, fi;
	
	public Meet(int st, int fi) {
		this.st = st;
		this.fi = fi;
	}
	// 끝나는 시간으로 정렬하고 끝나는 시간이 같으면 시작 시간으로 정렬
	@Override
	public int compareTo(Meet o) {
		if(this.fi== o.fi) return this.st - o.st; // 오름차순(this-매개변수) 내림차순(매개변수-this)
		else return this.fi - o.fi;
	}
}

public class Main9_2 {

	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		ArrayList<Meet> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int st = kb.nextInt();
			int fi = kb.nextInt();
			list.add(new Meet(st,fi));
		}
		
		System.out.println(solution(list, n));

	}
	
	public static int solution(ArrayList<Meet> arr, int n) {
		int answer = 0;
		Collections.sort(arr);
		int et = 0;
		for(Meet ob : arr) {
			if(ob.st >= et) {
				answer++;
				et = ob.fi;
			}
		}
			
		return answer;
		
	}

}
