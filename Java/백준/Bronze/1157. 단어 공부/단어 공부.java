import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String input=in.nextLine();
		in.close();
		int[] arr= new int[26];
		for(int i=0;i<input.length();i++) {
			if (input.charAt(i)<='Z') {
				arr[input.charAt(i)-65]++;
			}
			else {
				arr[input.charAt(i)-97]++;
			}
		}
		int max=-1,max_i=0,count=0;
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max=arr[i];
				max_i=i;
				count=0;
			}
			else if(arr[i]==max) {
				count++;
			}
		}
		System.out.print((count>0)?"?":(char)(max_i+65));
	}
} 