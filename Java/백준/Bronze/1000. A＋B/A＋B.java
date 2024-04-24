import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		String all= ex.nextLine();
		String[] num=all.split(" ");
		System.out.println(Integer.parseInt(num[0])+Integer.parseInt(num[1]));
	}
}
