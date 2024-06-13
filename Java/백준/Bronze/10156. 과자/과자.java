import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int n=in.nextInt();
		int m=in.nextInt();
		System.out.println((k*n-m)>0?k*n-m:0);
	}
}
