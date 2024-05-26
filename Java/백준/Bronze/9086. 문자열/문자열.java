import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int n= in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++) {
			String a=in.nextLine();
			System.out.print(a.charAt(0));
			System.out.print(a.charAt(a.length()-1)+"\n");
		}
	}
}
