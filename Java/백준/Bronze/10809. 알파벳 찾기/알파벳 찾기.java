import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		String n= in.nextLine();
		int[] abc=new int[26];
		for(int i=0;i<abc.length;i++) { //알파벳 배열 초기화
			abc[i]=-1;
		}
		for(int i=0;i<n.length();i++) { //알파벳 배열에 인덱스 저장
			if(abc[n.charAt(i)-97]==-1) abc[n.charAt(i)-97]=i;
		}
		for(int i=0;i<abc.length;i++) { //알파벳 배열 출력
			System.out.print(abc[i]+" ");
		}
	}
}
