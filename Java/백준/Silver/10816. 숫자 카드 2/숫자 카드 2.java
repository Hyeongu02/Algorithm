import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); //n 사용안함
		int[] counting =new int[20000001];
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		while(st.hasMoreElements()) { //counting 정렬
			counting[Integer.parseInt(st.nextToken())+10000000]++;
		}
		br.readLine(); //m 사용안함
		st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb=new StringBuilder();
		while(st.hasMoreElements()) {
			sb.append(counting[Integer.parseInt(st.nextToken())+10000000]).append(" ");
		}
		System.out.println(sb);
	}
}