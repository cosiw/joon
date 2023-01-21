package joon.section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main6_6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int [] arr = new int [n];
		
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		for(int x : solution(n, arr)) System.out.print(x + " ");
	}
	
	public static ArrayList<Integer> solution(int n, int arr[]){
		ArrayList<Integer> answer = new ArrayList<>();
		
		/*
		HashMap<Integer,Integer> map = new HashMap<>();
		HashMap<Integer,Integer> map1 = new HashMap<>();
		
		for(int i =0; i<n; i++) {
			map.put(i, arr[i]);
		}
		Arrays.sort(arr);
		
		for(int i =0; i<n; i++) {
			map1.put(i, arr[i]);
		}
		
		for(int i=0; i<n; i++) {
			if(!map.get(i).equals(map1.get(i))) answer.add(i+1);

		}
		*/
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		for(int i =0; i<n; i++) {
			if(arr[i] != tmp[i]) answer.add(i+1);
		}
		
		return answer;
	}

}
