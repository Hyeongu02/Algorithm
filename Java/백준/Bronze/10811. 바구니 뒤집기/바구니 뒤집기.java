import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int tmp=0;
		int[] basket=new int[n];
		for(int i=0;i<n;i++) {
			basket[i]=i+1;
		}
		for(int i=0;i<m;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			int len=((b-a)%2==0)?(b-a+1)/2:(b-a)/2;
			for(int j=0;j<=len;j++) {
				tmp=basket[a+j-1];
				basket[a+j-1]=basket[b-j-1];
				basket[b-j-1]=tmp;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(basket[i]+" ");
		}
	}
} 