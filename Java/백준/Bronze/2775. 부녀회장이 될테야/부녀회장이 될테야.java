import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int k=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			int[][] room= new int[k+1][n];
			for(int j=0;j<n;j++) {
				room[0][j]=j+1;
			}
			for(int a=1;a<k+1;a++) {
				for(int b=0;b<n;b++) {
					if (b==0) room[a][0]=1;
					else room[a][b]=room[a-1][b]+room[a][b-1];
				}
			}
			bw.append(Integer.toString(room[k][n-1])+'\n');
		}
		bw.flush();
		br.close();
		bw.close();
	}
}