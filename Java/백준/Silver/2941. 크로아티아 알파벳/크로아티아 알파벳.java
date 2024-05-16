import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String input=in.nextLine();
		in.close();
		char[] arr=new char[input.length()+1];
		int count=0;
		for(int i=0;i<input.length();i++) {
			arr[i]=input.charAt(i);
		}
		for(int i=0;i<input.length();i++) {
			if(arr[i]=='c') {
				if(arr[i+1]=='=') {
					i++;
				}
				else if(arr[i+1]=='-') {
					i++;
				}
			}
			else if(arr[i]=='d') {
				if(arr[i+1]=='z'&&arr[i+2]=='=') {
					i+=2;
				}	
				else if(arr[i+1]=='-') {
					i++;
				}
			}
			else if(arr[i]=='l') {
				if(arr[i+1]=='j') {
					i++;
				}
			}
			else if(arr[i]=='n') {
				if(arr[i+1]=='j') {
					i++;
				}
			}
			else if(arr[i]=='s') {
				if(arr[i+1]=='=') {
					i++;
				}
			}
			else if(arr[i]=='z') {
				if(arr[i+1]=='=') {
					i++;
				}
			}
			count++;
		}
		System.out.println(count);
	}
} 