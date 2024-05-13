import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int N= in.nextInt();
		int M= in.nextInt();
		int[][] A=new int[N][M];
		int[][] B=new int[N][M];
		int[][] result=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				A[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				B[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				result[i][j]=A[i][j]+B[i][j];
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
