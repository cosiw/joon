package joon.section2;

import java.util.ArrayList;
import java.util.Scanner;
/*
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.
*/
public class Main2_9 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr [][] = new int [n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(solution(n,arr));

	}
	
	public static int solution(int n,int arr[][]) {
		int answer=0;
		// 2*2 6
		// 3*3 8
		// 4*4 10
		
		int sum1, sum2;
		
		for(int i=0; i<n; i++) {
			sum1 = sum2 =0;
			for(int j=0; j<n; j++) {
				sum1 +=arr[i][j];
				sum2 +=arr[j][i];
				
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1= sum2 = 0;
		for(int i = 0; i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		/*
		int [] sum = new int [2*n+2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sum[i] = sum[i] + arr[i][j];
				sum[i+n] = sum[i+n] + arr[j][i];
				if(i == j)
					sum[2*n] = sum[2*n] +arr[i][j];
				if(i+j == n-1)
					sum[1+2*n] = sum[1+2*n] + arr[i][j];
			}
		}
		
		answer = sum[0];
		for(int i=1; i<sum.length; i++) {
			if(answer < sum[i]) answer = sum[i];
		}
		*/
		return answer;
	}

}
