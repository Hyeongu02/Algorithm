import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(true) {
	        int n=in.nextInt();
	        String str="";
	        if (n==-1) break;
	        int sum=0;
	        for(int i=1;i<=n/2;i++) {
	        	if (n%i==0) {
	        		sum+=i;
	        		str+=Integer.toString(i)+" + ";
	        	}
	        }
	        if(n==sum) {
	        	System.out.printf("%d = ",n);
	        	System.out.println(str.substring(0,str.length()-3));
	        }
	        else {
	        	System.out.printf("%d is NOT perfect.\n",n);
	        }
        }
    }
}
