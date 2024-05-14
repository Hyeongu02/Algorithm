import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		in.nextLine();
		String[] file=new String[n];
		for(int i=0;i<n;i++) {
			file[i]=in.nextLine();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<file[0].length();j++) {
				if(file[0].charAt(j)!=file[i+1].charAt(j)) {
					file[0]=file[0].substring(0,j)+"?"+file[0].substring(j+1);
				}
			}
		}
		System.out.println(file[0]);
	}
} 