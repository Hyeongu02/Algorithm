import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr= {1,1,2,2,2,8};
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++) {
			int n=Integer.parseInt(st.nextToken());
			if(n!=arr[i]) bw.write(Integer.toString(arr[i]-n)+" ");
			else bw.write("0 ");
		}
		bw.flush();
		bw.close();
	}
}