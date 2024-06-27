import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb=new StringBuilder();
		String[] input=br.readLine().split(" ");
		int m=Integer.parseInt(input[0]);
		int n=Integer.parseInt(input[1]);
		int[] nums=new int[n+1];
		for(int i=2;i<=n;i++) {
			nums[i]=i;
		}
		for(int i=2;i*i<=n;i++) {
			if(nums[i]>0) {
				for(int j=i*i;j<=n;j+=i) {
					nums[j]=0;
				}
			}
		}
		for(int i=m;i<=n;i++) {
			if (nums[i]!=0)sb.append(nums[i]).append('\n');
		}
		System.out.println(sb);
		
	}
}