import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] arr= {1,1,2,2,2,8};
		int n=0;
		for(int i=0;i<6;i++) {
			n=in.nextInt();
			if (n!=arr[i]) System.out.print(arr[i]-n+" ");
			else System.out.print("0 ");
		}
	}
} 