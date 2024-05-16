import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<m;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			for(int j=a;j<=b;j++) {
				arr[j-1]=c;
			}
		}
		for(int i=0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}