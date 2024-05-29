import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++) {
			int sum=0;
			int count=1;
			String str=in.nextLine();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='O') {
					sum+=count++;
				}
				else if(str.charAt(j)=='X') {
					count=1;
				}
			}
			System.out.println(sum);
		}
	}
}