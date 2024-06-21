import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int tmp=n;
		int min=0;
		for(int i=1;tmp>4;i++) {
			tmp-=5;
			if(tmp%3==0) min=i;
		}
		n-=min*5;
		if(n%3==0)System.out.println(min+n/3);
		else System.out.println("-1");
	}
}