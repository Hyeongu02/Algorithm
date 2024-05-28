import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        in.close();
        int count=0;
        for(int i=1;i<=n/2;i++) {
        	if (n%i==0) {
        		count++;
        		if (count==k) System.out.println(i);
        	}
        }
        count++;
        if (count==k) System.out.println(n);
        if (count<k) System.out.println("0");
    }
}
