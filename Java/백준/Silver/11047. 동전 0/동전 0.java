import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int arr[] =new int[n];
		int count=0;
		for(int i=0; i<n;i++) {
			int input= Integer.parseInt(br.readLine());
			if(input>k) break;
			arr[i]=input;
			count++;
		}
		
		int answer=0;
		for(int j=count-1;j>=0;j--) {	
			answer+=k/arr[j];
			k%=arr[j];
			if(k==0)break;
		}
		System.out.println(answer);
	}
}
