package joon.section7;

public class Main7_6 {

	static int n;
	static int[] ch; // 이 숫자를 부분집합으로 사용한다 안한다 체크
	
	public void DFS(int L) { // L을 원소로 사용한다 or 사용하지 않는다
		if(L==n+1) {
			 String tmp = "";
			 for(int i=1; i<=n; i++) {
				 if(ch[i] == 1) tmp += (i+ " ");
			 }
			 if(tmp.length() > 0) System.out.println(tmp);
		}else {
			ch[L] = 1;
			DFS(L+1); // 왼쪽(사용한다)
			
			ch[L] = 0;
			DFS(L+1); // 오른쪽(사용하지 않는다)
		}
	}
	public static void main(String[] args) {
		Main7_6 T = new Main7_6();
		n = 3;
		ch=new int[n+1];
		T.DFS(1);

	}

}
