import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int x=in.nextInt();
		int t=1;
		int count=0;
		while(true) {
			if(x<=t+count) {
				if(t%2==1) {
					System.out.println((t+1-(x-count))+"/"+(x-count));
					break;
				}else {
					System.out.println((x-count)+"/"+(t+1-(x-count)));
					break;
				}
			}else {
				count+=t;
				t++;
			}
		}
	}
}
