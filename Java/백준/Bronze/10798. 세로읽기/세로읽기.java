import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String[] n= new String[5];
		int max=0;
		for(int i = 0; i < 5; i++) { 
			n[i]=in.nextLine();
			if(n[i].length()>max) {
				max=n[i].length(); //입력된 단어중 가장 긴 단어의 길이 저장
			}
		}
		in.close();
		
		char[][] text=new char[5][max];
		for(int i=0;i<5;i++) { //단어를 2차원 char에 저장
			for(int j=0;j<n[i].length();j++) {
				text[i][j]=n[i].charAt(j);
			}
		}
		for(int i=0;i<max;i++) { //출력
			for(int j=0;j<5;j++) {
				if (text[j][i]!='\u0000') System.out.print(text[j][i]);
			}
		}
	}
} 