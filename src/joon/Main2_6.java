package joon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2_6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int [] arr = new int [n];
		
		for(int i=0; i<n;i++) {
			arr[i] = kb.nextInt();
		}

		for(int x : solution(n, arr))
		System.out.print(x + " ");
	}
	
	public static ArrayList<Integer> solution(int n, int [] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp % 10;
				res = res*10 + t;
				tmp = tmp/10;
			}
			if(isPrime(res)) answer.add(res);
					
		}
		/*
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			
			while(tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp/10;
			}
			
			if(isPrime(res)) answer.add(res);
		}
		*/
		/*
		String [] rnum = new String[n];
		for(int i=0; i<n; i++) {
			rnum[i] = String.valueOf(num[i]);
		}
		
		for(int i=0; i<n; i++) {
			for(int j=rnum[i].length()-1; j>=0;j--) {
				rnum[i] += rnum[i].charAt(j);
			}
		}
		
		for(int i=0; i<rnum.length; i++) {
			System.out.println(rnum[i]);
		}
		*/
		
		return answer;
	}
	
	public static boolean isPrime(int num) {
		if(num == 1 ) return false;
		for(int i =2; i<num; i++) {
			if(num%i == 0) return false;
			
		}
		
		/*
		if(num==1) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		*/
		
		return true;
	}

}
