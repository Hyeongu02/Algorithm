import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		boolean[] arr=new boolean[30];
		int n=0;
		for(int i=0;i<28;i++) {
			n=in.nextInt();
			arr[n-1]=true;
		}
		in.close();
		for(int i=0;i<30;i++) {
			if(arr[i]==false) System.out.println(i+1);
		}
	}
} 