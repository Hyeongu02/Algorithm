import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		int[] input=new int[a];
		for(int i=0;i<a;i++) {
			input[i]=in.nextInt();
		}
		Arrays.sort(input);
		if(a==1) {
			System.out.print(input[0]*input[0]);
		}
		else {
			System.out.print(input[0]*input[a-1]);
		}
	}
}