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
		//�ڿ��� N�� �ԷµǸ� ����Լ��� �̿��Ͽ� 1���� N������ ����ϴ� ���α׷��� �ۼ�

		//DFS(3);
		DFS2(11);
	}
	


}
