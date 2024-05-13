import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		int result=0;
		int[][] paper =new int[100][100];
		for(int i=0;i<a;i++) {
			int x=in.nextInt();
			int y=in.nextInt();
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					paper[j][k]=1;
				}
			}
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(paper[i][j]==1) result++;
			}
		}
		System.out.print(result);
	}
}
