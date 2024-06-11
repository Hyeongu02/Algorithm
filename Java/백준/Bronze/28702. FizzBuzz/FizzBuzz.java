import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=0;
		int count=0;
		for(int i=0;i<3;i++) {		
			try {
				a=Integer.parseInt(br.readLine());
				count=i+1;
			} catch (NumberFormatException e) {}
		}
		a+=4-count;
		if(a%3==0) {
			if(a%5==0) {
				System.out.println("FizzBuzz");
			}else {
				System.out.println("Fizz");
			}
		}else {
			if(a%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(a);
			}
		}
	}
}
