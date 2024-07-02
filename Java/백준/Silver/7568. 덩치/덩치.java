import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb= new StringBuilder();
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		int[][] nums=new int[n][2];
		for(int i=0; i<n;i++) {
			st=new StringTokenizer(br.readLine()," ");
			nums[i][0]=Integer.parseInt(st.nextToken());
			nums[i][1]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			int level=1;
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				if(nums[i][0]<nums[j][0]&&nums[i][1]<nums[j][1]) level++;
			}
			sb.append(level).append(" ");
		}
		System.out.println(sb);
	}
}