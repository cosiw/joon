package joon.section7;

public class Main7_6 {

	static int n;
	static int[] ch; // �� ���ڸ� �κ��������� ����Ѵ� ���Ѵ� üũ
	
	public void DFS(int L) { // L�� ���ҷ� ����Ѵ� or ������� �ʴ´�
		if(L==n+1) {
			 String tmp = "";
			 for(int i=1; i<=n; i++) {
				 if(ch[i] == 1) tmp += (i+ " ");
			 }
			 if(tmp.length() > 0) System.out.println(tmp);
		}else {
			ch[L] = 1;
			DFS(L+1); // ����(����Ѵ�)
			
			ch[L] = 0;
			DFS(L+1); // ������(������� �ʴ´�)
		}
	}
	public static void main(String[] args) {
		Main7_6 T = new Main7_6();
		n = 3;
		ch=new int[n+1];
		T.DFS(1);

	}

}
