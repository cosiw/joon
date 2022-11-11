package joon;

import java.util.Scanner;

public class Main2_2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int stu [] = new int [n];
		for(int i=0; i<n;i++)
			stu[i] = kb.nextInt();
		
		System.out.println(solution(n,stu));
	}
	
	public static int solution(int n, int stu[]) {
		int answer = 1;
		
		int max = stu[0];
		for(int i=1; i<n; i++) {
			if(stu[i] > max) {
				max = stu[i];
				answer++;
			}
		}
		
		
		return answer;
	}

}
