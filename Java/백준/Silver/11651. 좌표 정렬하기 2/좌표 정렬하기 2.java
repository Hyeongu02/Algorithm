import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		StringBuilder sb= new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		int[][] nums=new int[n][2];
		for(int i=0; i<n;i++) {
			st=new StringTokenizer(br.readLine()," ");
			nums[i][0]=Integer.parseInt(st.nextToken());
			nums[i][1]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums,(arr1, arr2) ->{
			if(arr1[1]==arr2[1]) {
				return arr1[0]-arr2[0];
			}else {
				return arr1[1]-arr2[1];
			}
		});
		for(int i=0;i<n;i++) {
			sb.append(nums[i][0]).append(" ").append(nums[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}