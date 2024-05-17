import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt(); //배열의 크기 받기
		int m=in.nextInt();
		int[][] arr= new int[n][m];
		for(int i = 0; i < n; i++) { //배열 초기화
			for(int j = 0; j < m; j++) {
				arr[i][j] = 0; 
			}
		}
		for(int i=0;i<2;i++) { //값 넣기
			for(int j=0;j<n;j++) {
				for(int k=0;k<m;k++) {
					arr[j][k]+=in.nextInt();
				}
			}
		}
		in.close();
		for(int j=0;j<n;j++) { //출력
			for(int k=0;k<m;k++) {
				System.out.print(arr[j][k]+" ");
			}
			System.out.println();
		}
	}
} 