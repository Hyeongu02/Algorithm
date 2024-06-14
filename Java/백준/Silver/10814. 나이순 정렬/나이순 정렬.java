import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[][] member=new String[n][2];
		for(int i=0;i<n;i++) {
			member[i]=br.readLine().split(" ");
		}
	
		Arrays.sort(member,(arr1, arr2) ->Integer.compare(Integer.parseInt(arr1[0]), Integer.parseInt(arr2[0])));
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(member[i][0]).append(' ').append(member[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}