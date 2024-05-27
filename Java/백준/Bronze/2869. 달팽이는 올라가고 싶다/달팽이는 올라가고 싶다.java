import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int up =in.nextInt();
		int down =in.nextInt();
		int len =in.nextInt();
		int day=(len - down)/(up-down);
		if ((len - down)%(up-down) >0) day++;
		System.out.println(day);
	}
}
