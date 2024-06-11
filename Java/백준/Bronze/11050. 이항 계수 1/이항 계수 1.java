import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		System.out.println(factorial(a)/(factorial(b)*factorial(a-b)));
	}
	static int factorial(int a) {
		if(a==0) return 1;
		return a*factorial(a-1);
	}
}
