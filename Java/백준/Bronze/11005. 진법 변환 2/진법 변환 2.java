import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		String[] a=in.nextLine().split(" ");
		System.out.println(Long.toString(Long.parseLong(a[0]),Integer.parseInt(a[1])).toUpperCase());
	}
}
