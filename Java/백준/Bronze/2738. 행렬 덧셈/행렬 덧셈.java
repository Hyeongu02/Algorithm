import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine(), " ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int [][] arr =new int[n][m];
		for(int i=0;i<2;i++) { // 두 행렬 입력
			for(int j=0;j<n;j++) {
				st=new StringTokenizer(br.readLine(), " ");
				for(int k=0;k<m;k++) {
					arr[j][k]+=Integer.parseInt(st.nextToken());
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) { //출력
			for(int j=0;j<m;j++) {
				sb.append(arr[i][j]).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}