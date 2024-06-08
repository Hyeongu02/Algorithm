import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				bw.append(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				bw.append("*");
			}
			bw.append('\n');
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				bw.append(" ");
			}
			for(int j=0;j<2*n-i*2-1;j++) {
				bw.append("*");
			}
			bw.append('\n');
		}
		bw.flush();
	}
}