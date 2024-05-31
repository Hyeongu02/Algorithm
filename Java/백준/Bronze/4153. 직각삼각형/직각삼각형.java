import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String[] n= br.readLine().split(" ");
			int[] arr=new int[n.length];
			for(int i=0;i<n.length;i++) {
				arr[i]=Integer.parseInt(n[i]);
			}
			Arrays.sort(arr);
			if(arr[2]==0) break;
			if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}