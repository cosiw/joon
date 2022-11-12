package joon;

import java.util.Scanner;
/*
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.
*/
public class Main2_5 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
	
		int num = kb.nextInt();
		
		System.out.println(solution(num));

	}
	
	public static int solution(int num) {
		int answer = 0;
		
		int [] ch = new int[num+1];
		for(int i=2; i<num; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j =i; j<num; j= j+i) {
					ch[j] = 1;
				}
			}
		}
		/*
		for(int i=2; i<=num; i++) {
			for(int j=1; j<num; j++) {
				if(i%j == 0) cnt++;
			}
			if(cnt == 2) answer++;
			cnt = 0;
		}
		*/
		
		//에라토스테네스 체 1, 2, 3, 4 소수 체크하고 각 숫자의 배수를 다 삭제함으써 소수를 구함
		return answer;
	}

}
