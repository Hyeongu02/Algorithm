import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int h= in.nextInt();
		int m= in.nextInt();
		in .nextLine();
		int c= in.nextInt();
		while(c>60) {
			c-=60;
			h++;
		}
		if((m+c)<60) {
			m+=c;
		}else {
			m +=c-60;
			h++;
		}
		if(h>23) h -=24;
		System.out.printf("%d %d",h,m);
	}
}