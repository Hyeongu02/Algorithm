import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		String x=in.nextLine();
		in.close();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=x.charAt(i)-'0';	
		}
		System.out.println(sum);
	}
}
