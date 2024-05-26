import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int tmp=0;
		int n= in.nextInt();
		for(int i=0;i<n;i++) {
			int price=in.nextInt();
			int pcs=in.nextInt();
			tmp +=price*pcs;
		}
		System.out.println((total==tmp)?"Yes":"No");
	}
}