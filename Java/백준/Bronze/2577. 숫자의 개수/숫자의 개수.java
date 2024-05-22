import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int sum=1;
		int[] arr= new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=0;
		}
		for(int i=0;i<3;i++) {
			int n=in.nextInt();
			sum *=n;
		}
		in.close();
		int tmp =sum;
		for(int i=1;i<=sum;i*=10) {
			arr[tmp%10]++;
			tmp/=10;
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}
}