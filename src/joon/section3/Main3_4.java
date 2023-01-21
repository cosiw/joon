package joon.section3;

import java.util.Scanner;


public class Main3_4 {

	/*
	 * 설명

N개의 수로 이루어진 수열이 주어집니다.

이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

만약 N=8, M=6이고 수열이 다음과 같다면

1 2 1 3 1 1 1 2

합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.


입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.

수열의 원소값은 1,000을 넘지 않는 자연수이다.


출력
첫째 줄에 경우의 수를 출력한다.
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = kb.nextInt();
			
		
		System.out.println(solution(n,m,arr));

	}
	
	public static int solution(int n, int m, int arr[]) {
		int answer = 0;
		
		int sum = 0;
		int p = 0;
		int lt = 0;
		for(int rt =0; rt<n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		
		/*
		for(int i=0; i<n; i++) {

			if(sum < m) {
				sum += arr[i];
				if(i ==n-1 && sum == m) answer++;
			} else if(sum == m) {
				answer++;
				sum += arr[i];
			} else {
				sum -= arr[p];
				p++;
				i--;
			}
	
		}
		*/
		return answer;
	}

}
