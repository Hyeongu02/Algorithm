import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb= new StringBuffer();
		int N=Integer.parseInt(br.readLine()); 
		int tmp=N;
		while(N>0) {
			for(int i=2;i<=tmp;i++) {
				if(N%i==0) {
					N/=i;
					sb.append(i).append('\n');
					break;
				}
			}
			if(N==1)break;
		}
		System.out.println(sb);
	}
}