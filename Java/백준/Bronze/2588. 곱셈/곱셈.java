import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a= in.nextInt();
		int b= in.nextInt();
		int tmp=b;
		int sum=0;
		for(int i=1;i<=b;i*=10) {
			System.out.println(a*(tmp%10));
			sum+=a*(tmp%10)*i;
			tmp/=10;
		}
		System.out.println(sum);
	}
}