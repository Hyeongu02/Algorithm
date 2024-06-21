import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		int [][] paper=new int[100][100];
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				paper[i][j]=0;
			}
		}
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String[] str=br.readLine().split(" ");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			for(int x=a;x<10+a;x++) {
				for(int y=b;y<10+b;y++) {
					paper[x][y]=1;
				}
			}
			
		}
		int sum=0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				sum+=paper[i][j];
			}
		}
		System.out.println(sum);
	}
}