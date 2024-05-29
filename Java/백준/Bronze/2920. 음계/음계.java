import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] n=new int[8];
		for(int i=0;i<8;i++) {
			n[i]=in.nextInt();
		}
		in.close();
		for(int i=1;i<8;i++) {
			if (n[i-1]-n[i]!=-1&&n[i-1]-n[i]!=1) {
				System.out.println("mixed");
				return;
			}
		}
		if (n[0]==1) System.out.println("ascending");
		else if (n[0]==8) System.out.println("descending");
	}
}