import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int count=n;
		in.nextLine();
		for(int i=0;i<n;i++) {
			boolean flag=false;
			String word=in.nextLine();
			int[] arr=new int[26];
			arr[word.charAt(0)-97]++;
			for(int j=1;j<word.length();j++) {
				if(word.charAt(j)!=word.charAt(j-1)) {
					flag=true;
				}
				if(flag==true&& arr[word.charAt(j)-97]>0) {
					count--;
					break;
				}else {
					arr[word.charAt(j)-97]++;
					flag=false;
				}
			}
		}
		System.out.print(count);
	}
} 