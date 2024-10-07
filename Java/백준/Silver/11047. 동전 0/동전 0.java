import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer=0;
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
		
		for(int j=count-1;j>=0;j--) {
			k=check(arr[j],k);
			if(k==0)break;
		}
		System.out.println(answer);
	}
	
	public static int check(int arr, int k){
		answer+=k/arr;
		return k%arr;
	}
}
