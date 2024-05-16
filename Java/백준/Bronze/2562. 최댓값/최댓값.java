import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=0;
		int max=0,max_index=0;
		for(int i=0;i<9;i++) {
			n=in.nextInt();
			if (n>max) {
				max=n;
				max_index=i;
			}
		}
        in.close();
		System.out.println(max);
		System.out.println(max_index+1);	
	}
} 