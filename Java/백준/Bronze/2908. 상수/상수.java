import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int a_tmp=0;
		int b_tmp=0;
		for(int i=100;i>0;i/=10) {
			a_tmp+=a%10*i;
			a/=10;
		}
		for(int i=100;i>0;i/=10) {
			b_tmp+=b%10*i;
			b/=10;
		}
		System.out.println((a_tmp>b_tmp)?a_tmp:b_tmp);
	}
}