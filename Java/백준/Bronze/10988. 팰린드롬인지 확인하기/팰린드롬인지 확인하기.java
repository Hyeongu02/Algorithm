import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String n=in.nextLine();
		in.close();
		int len=n.length()/2;
		boolean t=true;
		for(int i=0;i<len;i++) {
			if(n.charAt(i)!=n.charAt(n.length()-i-1)) {
				t=false;
			}
		}
		if(t==true) System.out.print("1");
		else System.out.print("0");
	}
} 