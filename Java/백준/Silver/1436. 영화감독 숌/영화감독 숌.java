import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int count=0;
        int s=666;
        while(true) {
        	if(Integer.toString(s).contains("666")) {
        		count++;
        	}
        	if(count==n) break;
        	s++;
        }
        System.out.println(s);
	}
}