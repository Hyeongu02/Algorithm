import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String[] a=new String[5];
		
		String answer="";
		for(int i=0;i<5;i++) {
			a[i]=in.nextLine();
		}
		int max=0;
		for(int i=0;i<5;i++) {
			if(a[i].length()>max) max=a[i].length();
		}
		char[][] b=new char[5][max];
		for(int i=0;i<5;i++) {
			for(int j=0;j<a[i].length();j++) {
				b[i][j]=a[i].charAt(j);
			}
		}
		for(int i=0;i<max;i++) {
			for(int j=0;j<a.length;j++) {
				if (b[j][i] !='\u0000') {
					answer+=b[j][i];
				}
			}
		}
		System.out.println(answer);
	}
}
