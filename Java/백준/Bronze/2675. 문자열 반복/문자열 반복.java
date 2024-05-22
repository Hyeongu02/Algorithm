import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		for(int i=0;i<t;i++) {
			String s=in.nextLine();
			int r=s.charAt(0)-'0';
			s=s.substring(2);
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<r;k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}