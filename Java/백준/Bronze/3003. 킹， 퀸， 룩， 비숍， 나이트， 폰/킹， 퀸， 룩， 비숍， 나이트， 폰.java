import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String input=in.nextLine();
		String[]a=input.split(" ");
		int[] chess= {1,1,2,2,2,8};
		int[] result=new int[6];
		for(int i=0;i<a.length;i++) {
			if(Integer.parseInt(a[i])>chess[i]) {
				result[i]=chess[i]-Integer.parseInt(a[i]);
			}
			else if(Integer.parseInt(a[i])<chess[i]) {
				result[i]=chess[i]-Integer.parseInt(a[i]);
			}
			else
				result[i]=0;
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}