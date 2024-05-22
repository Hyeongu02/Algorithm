import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] n=new int[3];
		for(int i=0;i<3;i++) {
			n[i]=in.nextInt();
		}
		in.close();
		Arrays.sort(n);
		if(n[0]==n[2]) {
			System.out.println(10000+n[0]*1000);
		}
		else if(n[0]==n[1]||n[1]==n[2]) {
			System.out.println(1000+n[1]*100);
		}else {
			System.out.println(n[2]*100);
		}
	}
}
