import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int x=in.nextInt();
		int t=0;
		int count=1;
		while(true) {
			if(x<=count) {
				System.out.println(t/6 +1);
				break;
			}else {
				t+=6;
				count+=t;
			}
		}
	}
}
