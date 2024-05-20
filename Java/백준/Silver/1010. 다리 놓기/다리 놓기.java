import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		for(int i=0;i<x;i++) {
			long n=in.nextLong();
			long m=in.nextLong();
			n=(m-n>n)?n:m-n;
			long a=1,b=1;
			for(long j=0;j<n;j++) {
				a *=(m-j);
			}
			for(long j=1;j<=n;j++) {
				b *= j;
			}
			System.out.println(a/b);
		}
		in.close();
	}
}