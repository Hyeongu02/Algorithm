import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String input=in.nextLine();
		int len=input.length();
		for(int i=0;i<len/2;i++) {
				if(input.charAt(i)!=input.charAt(len-i-1)) {
					System.out.println("0");
					return;
				}
		}
		System.out.print("1");
	}
}