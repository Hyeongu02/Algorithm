import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		br.close();
		int[] arr =new int[26];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				arr[str.charAt(i)-97]++;
			}else if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				arr[str.charAt(i)-65]++;
			}
		}
		int max=-1;
		int maxIndex=-1;
		int count=0;
		for(int i=0;i<26;i++){
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
				count=0;
			}else if(max==arr[i]) {
				count++;
			}
		}
		System.out.println((count>0)?"?":(char)(maxIndex+65));
	}
}