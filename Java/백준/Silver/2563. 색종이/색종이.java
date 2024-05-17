import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		boolean[][] paper=new boolean[100][100];
		for(int i=0;i<100;i++) { //도화지 배열 false로 초기화
			for(int j=0;j<100;j++) {
				paper[i][j]=false;
			}
		}
		
		int n=in.nextInt();
		for(int i=0;i<n;i++) { //검은색 색종이가 있는 위치를 true으로 만듬
			int x=in.nextInt();
			int y=in.nextInt();
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					paper[j][k]=true;
				}
			}
		}
		int area=0;
		for(int i=0;i<100;i++) { //true인 부분 찾기
			for(int j=0;j<100;j++) {
				if (paper[i][j]==true) area++;
			}
		}
		System.out.println(area);
	}
} 