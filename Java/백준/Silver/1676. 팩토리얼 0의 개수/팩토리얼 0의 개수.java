import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int count2=0;
		int count5=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0 ||i%5==0) {
				int tmp=i;
				while(true) {
					if(tmp%2==0) {
						count2++;
						tmp/=2;
					}
					if(tmp%5==0) {
						count5++;
						tmp/=5;
					}
					if(tmp%2!=0 &&tmp%5!=0) break;
				}
			}
		}
		System.out.println((count2<=count5)?count2:count5);
	}
}
