package joon;

public class Main7_1 {
	//7_1
	public static void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
		
	}
	//7_2
	public static void DFS2(int n) {
		if(n == 0) return;

		DFS2(n/2);
		System.out.print(n%2 + "");
		
		
	}

	public static void main(String[] args) {
		//자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성

		//DFS(3);
		DFS2(11);
	}
	


}
