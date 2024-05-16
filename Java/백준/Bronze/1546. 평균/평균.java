import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n= in.nextInt();
		double[] arr=new double[n];
		double sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=in.nextDouble();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			sum +=arr[i]/arr[n-1]*100.0;
		}
		System.out.print(sum/n);	
	}
} 