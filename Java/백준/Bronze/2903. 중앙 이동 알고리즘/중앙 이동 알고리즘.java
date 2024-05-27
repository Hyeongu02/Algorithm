import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int n= in.nextInt();
		int x=3;
		int y=2;
		for(int i=1;i<n;i++) {
			x+=y;
			y*=2;
		}
		System.out.println((int)Math.pow(x, 2));
	}
}
