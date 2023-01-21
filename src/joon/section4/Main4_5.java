package joon.section4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main4_5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int [] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		System.out.println(solution(n,k,arr));
		
	}
	
	public static int solution(int n, int k, int arr[]) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l = j+1; l<n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		//Tset.remove(143);
		//System.out.println(Tset.size());
		System.out.println(Tset.first());
		System.out.println(Tset.last());
		for(int x : Tset) {
			System.out.println(x);
			cnt++;
			if(cnt == k)
				answer = x;
			
		}
			
		return answer;
	}

}
