package joon.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Main6_8 {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int arr [] = new int [n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		System.out.println(solution(n,m,arr));
	}
	
	public static int solution(int n, int m, int arr[]) {
		int answer = 0;
		/*
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			if(m == arr[i])
				answer = i+1;
		}
		*/
		
		// �̺� �˻�
		Arrays.sort(arr);
		int lt = 0;
		int rt = n-1;
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid] == m) {
				answer = mid+1;
				break;
			}
			if(arr[mid] > m) rt=mid-1;
			else lt = mid +1;
		}
		
		return answer;
	}

}
