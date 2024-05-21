import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String n= in.nextLine();
		int count=1;
		for(int i=1;i<n.length();i++) {
			if(n.charAt(i)==' ') {
				count++;
			}
		}
		if(n.charAt(n.length()-1)==' ') count--;
		System.out.println(count);
	}
}
