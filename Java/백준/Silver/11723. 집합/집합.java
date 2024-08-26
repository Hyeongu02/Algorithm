import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		StringTokenizer st=null;
		boolean[] list = new boolean[20];
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			st=new StringTokenizer(br.readLine()," ");
			String x=st.nextToken();
			Integer y=null;
			if(st.hasMoreTokens()) {				
				y=Integer.parseInt(st.nextToken());
			}
			switch (x) {
			case "add":
				list[y-1]=true;
				break;
			case "remove":
				list[y-1]=false;
				break;
			case "check":
				if(list[y-1]==true) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				break;
			case "toggle":
				if(list[y-1]==true) {
					list[y-1]=false;
				}else {
					list[y-1]=true;
				}
				break;
			case "all":
				for(int j=0;j<20;j++) {
					list[j] = true;					
				}
				break;
			case "empty":
				list = new boolean[20];
				break;
			default:
				break;
			}
			
		}
		System.out.println(sb);
	}
}
