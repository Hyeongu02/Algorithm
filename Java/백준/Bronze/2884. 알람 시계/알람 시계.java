import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int H=in.nextInt();
		int M=in.nextInt();
        in.close();
		if(M>=45) M-=45;
		else{ 
			M+=15;
			H--;
		}
		if (H<0) H +=24;
		System.out.printf("%d %d",H,M);	
	}
}