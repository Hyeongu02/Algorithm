import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a=0,max=0,x=0,y=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				a=in.nextInt();
				if(a>max) {
					max=a;
					x=i;
					y=j;
				}
			}
		}
		System.out.println(max);
		System.out.println((x+1)+" "+(y+1));
	}
}