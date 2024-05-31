import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n=new int[Integer.parseInt(br.readLine())];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n.length;i++) {
			n[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(n);
		int[] m=new int[Integer.parseInt(br.readLine())];
		st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m.length;i++) {
			m[i]=Integer.parseInt(st.nextToken());
		}
		for(int i:m) {
			int max=n.length-1;
			int min=0;
			boolean find =false;
			while(max>=min) {
				int mid=(max+min)/2;
				if(n[mid]>i) max=mid-1;
				else if(n[mid]<i) min=mid+1;
				else {
					System.out.println("1");
					find=true;
					break;
				}
			}
			if (find==false) System.out.println("0");
		}
	}
}
