package joon;

import java.util.Arrays;
import java.util.Scanner;

public class Main6_9 {

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
		int sum = 0;
		int [] sumArr = new int [m]; 
		int a =0;
		
		for(int i=0; i<n; i++) sum += arr[i];
		
		
		for(int i = 0; i<m; i++) {
			for(int j=a; j<n; j++) {
				if(sumArr[i] + arr[j] > sum/m) {
					a = j;
					break;
				}else sumArr[i] += arr[j];
				
				System.out.println(sumArr[i]);
			}
		}
		
		Arrays.sort(sumArr);
		//for(int i =0; i<m; i++) System.out.println(sumArr[i]);
		//answer = sumArr[m-1];
		*/
		
		// ���� �˰���
		int lt = Arrays.stream(arr).max().getAsInt(); // ���� ū �� ����
		int rt = Arrays.stream(arr).sum(); // array�� ��� ���� ���� ��
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid-1;
			} else lt=mid+1;
		}
		
		return answer;
	}
	
	public static int count(int[] arr, int capacity) {
		int cnt = 1; //DVD ���
		int sum = 0;
		for(int x : arr) {
			if(sum+x > capacity) {
				cnt++;
				sum = x;
			}
			else sum +=x;
		}
		
		return cnt;
	}

}
