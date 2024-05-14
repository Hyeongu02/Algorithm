import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int input=0;
		int max=-1000001;
		int min= 1000001;
		for(int i=0;i<n;i++) {
			input=in.nextInt();
			if(input>max) max=input;
			if(input<min) min=input;
		}
		System.out.printf("%d %d",min,max);
	}
} 