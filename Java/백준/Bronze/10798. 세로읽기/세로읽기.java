import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] str=new String[5];
		int max=0;
		for(int i=0;i<5;i++) { //입력 + 문자열의 최대길이 찾기
			str[i]=br.readLine();
			if(str[i].length()>max) max=str[i].length();
		}
		char[][] answer=new char[5][max]; //단어를 2차원 char에 저장
		for(int i=0;i<5;i++) {
			for(int j=0;j<str[i].length();j++) {
				answer[i][j]=str[i].charAt(j);
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<max;i++) { //출력 - char배열의 기본값 '\u0000'
			for(int j=0;j<5;j++) {
				if(answer[j][i]!='\u0000') sb.append(answer[j][i]); 
			}
		}
		System.out.println(sb);	
	}
}