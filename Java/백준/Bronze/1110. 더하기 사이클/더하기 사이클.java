import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int tmp=n;
		int count=0;
		while(true) {
			n=(n%10)*10+((n/10)%10+n%10)%10;
			count++;
			if(tmp==n) break;
		}
		System.out.println(count);
	}
}