import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	static int[] n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=new int[Integer.parseInt(br.readLine())];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n.length;i++) {
			n[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(n);
		int m=Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine()," ");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<m;i++) {
			if (find(Integer.parseInt(st.nextToken()))>-1) {
				sb.append(1);
				sb.append('\n');			
			}else {
				sb.append(0);
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}
	static int find(int i) {
		int max=n.length-1;
		int min=0;
		boolean find =false;
		while(max>=min) {
			int mid=(max+min)/2;
			if(n[mid]>i) max=mid-1;
			else if(n[mid]<i) min=mid+1;
			else {
				return mid;
			}
		}
		return -1;
	}
}