package joon.section2;

import java.util.ArrayList;
import java.util.Scanner;

/*
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
*/
public class Main2_1 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int cnt = kb.nextInt();
		
		int [] num = new int [cnt];
		
		for(int i=0; i<num.length; i++)
			num[i] = kb.nextInt();
	
		for(int s : solution(num))
		System.out.print(s + " ");
		
	}
	
	public static ArrayList<Integer> solution (int [] num) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++) {
			if(i == 0) {
				answer.add(num[i]);
				continue;
			}
			if(num[i-1] < num[i]) {
				answer.add(num[i]);
			}
			
		}

		return answer;
		
	}

}
