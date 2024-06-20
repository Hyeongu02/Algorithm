import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		int[] stack=new int[n];
		int first=0;
		int last=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				stack[last]=Integer.parseInt(st.nextToken());
				last++;
				break;
			case "pop":
				if(last-first==0) sb.append(-1).append('\n');
				else {
					sb.append(stack[first]).append('\n');
					first++;
				}
				break;
			case "size":
				sb.append(last-first).append('\n');
				break;
				
			case "empty":
				sb.append((last-first==0)?1:0).append('\n');
				break;
				
			case "front":
				if(last-first==0) sb.append(-1).append('\n');
				else sb.append(stack[first]).append('\n');
				break;
			case "back":
				if(last-first==0) sb.append(-1).append('\n');
				else sb.append(stack[last-1]).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}
}