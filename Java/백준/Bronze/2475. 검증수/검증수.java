import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int check=0;
		for(int i=0;i<5;i++) {
			int n=in.nextInt();
			check +=n*n;
		}
		in.close();
		System.out.println(check%10);
	}
}