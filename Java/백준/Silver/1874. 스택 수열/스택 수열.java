
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		int start=0;
		int idx =0;
		for(int i=0;i<n;i++) {
			int input=Integer.parseInt(br.readLine());
			if(input>start) {
				for(int j=start+1;j<=input;j++) {
					arr[idx]=j;
					idx++;
					sb.append("+").append('\n');
				}
				start=input;
			}else if(arr[idx-1]!=input) {
				System.out.println("NO");
				return;
			}
			idx--;
			sb.append("-").append('\n');
		}
		System.out.println(sb);
	}
}