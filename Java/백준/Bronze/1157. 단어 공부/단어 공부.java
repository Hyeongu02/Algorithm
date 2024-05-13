import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr=new int[26];
		int max=0;
		int count=0;
		String input=in.nextLine();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)<='Z') {
				arr[input.charAt(i)-'A']++;
			}
			else {
				arr[input.charAt(i)-'a']++;
			}
		}
		char ch='?';
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch=(char)(i+65);
			}
			else if(arr[i]==max) ch='?';
		}
		System.out.print(ch);
	}
}
