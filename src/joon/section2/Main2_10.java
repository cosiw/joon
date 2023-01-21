package joon.section2;

import java.util.Scanner;

/*
���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.

�� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.

������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.

���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.


�Է�
ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)

�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.


���
���츮�� ������ ����ϼ���.
*/
public class Main2_10 {
	
	static int[] dx = {-1, 0, 1, 0 };
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		
		int [][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(solution(n,arr));
	}
	
	public static int solution(int n, int[][] arr) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					if(nx >=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j] ) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		/*
		int [][]arr1 = new int[n+2][n+2]; 
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr1[i+1][j+1] = arr[i][j];	
			}
			
		}
		
		for(int i=1; i<arr1.length-1; i++) {
			for(int j=1; j<arr1.length-1; j++) {
				if(arr1[i][j] - arr1[i-1][j] > 0 && arr1[i][j] - arr1[i][j-1] >0 && arr1[i][j] - arr1[i+1][j] > 0 && arr1[i][j] - arr1[i][j+1] > 0) {
					answer++;
				}
			}

		}
		*/
		
		
		
		return answer;
	}

}
