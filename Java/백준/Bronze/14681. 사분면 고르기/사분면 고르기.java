import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int x= in.nextInt();
		int y= in.nextInt();
		in.close();
		System.out.println((x>0)?(y>0)?"1":"4":(y>0)?"2":"3");
	}
}