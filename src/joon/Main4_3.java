package joon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main4_3 {

	 public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			
			int n = kb.nextInt();
			int k = kb.nextInt();
			
			int arr [] = new int[n];
			for(int i=0; i<n; i++)
				arr[i] = kb.nextInt();
			
			for(int x : solution(n,k,arr)) {
				System.out.print(x + " ");
			}
		}
	  
	  public static ArrayList<Integer> solution(int n, int k, int[] arr){
			ArrayList<Integer> answer = new ArrayList<>();
			
			
			
			/*HashMap<Integer, Integer> HM = new HashMap<>();
			for(int i =0; i<k-1; i++) {
				HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
			}
			int lt = 0;
			
			for(int rt =k-1; rt<n; rt++) {
				HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
				answer.add(HM.size());
				HM.put(arr[lt], HM.get(arr[lt])-1);
				if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
				lt++;
			}
			return answer;
			*/
			ArrayList<Integer> list = new ArrayList<>();
			
			int lt =0 , rt = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			int cnt = 0;
			
			for(rt =0 ; rt < n; rt++) {
				if(list.contains(arr[rt])) cnt ++;
				list.add(arr[rt]);	
				if(list.size() == k) {
					map.put(lt, k-cnt);
					answer.add(map.get(lt));
					list.remove(lt);
					lt++;		
					cnt = 0;
				}
			}
			
			return answer;
		
			
		}

}
