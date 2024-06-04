import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L=Integer.parseInt(br.readLine());
		String str=br.readLine();
		Long result=0L;
		Long pow=1L;
		for(int i=0;i<L;i++) {
			result+=(str.charAt(i)-96)*pow;
			pow=pow*31%1234567891;
		}
		result %=1234567891;
		System.out.println(result);
	}
}