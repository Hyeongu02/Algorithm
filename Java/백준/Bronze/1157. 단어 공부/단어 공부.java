import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int c;
		int[] arr=new int[26];
		while((c=br.read())>64) {
			if(c<91) arr[c-65]++;
			else arr[c-97]++;
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