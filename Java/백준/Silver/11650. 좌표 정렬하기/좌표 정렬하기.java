import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] point=new int[n][2];
		for(int i=0;i<n;i++) {
			String[] str=br.readLine().split(" ");
			point[i][0]=Integer.parseInt(str[0]);
			point[i][1]=Integer.parseInt(str[1]);
		}
		Arrays.sort(point,(arr1,arr2) -> {
			if(arr1[0]==arr2[0]) {
				return arr1[1]-arr2[1];
			}else {
				return arr1[0]-arr2[0];
			}
		});
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(point[i][0]).append(" ").append(point[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}