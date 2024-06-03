import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L=Integer.parseInt(br.readLine());
		String str=br.readLine();
		int sum=0;
		for(int i=0;i<L;i++) {
			sum+=(int)((str.charAt(i)-96)*Math.pow(31, i)); 
		}
		sum%=1234567891;
		System.out.println(sum);
	}
}