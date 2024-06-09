import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int n=Integer.parseInt(br.readLine());
		a :for(int i=0;i<n;i++) {
			boolean[] apb=new boolean[26];
			String str=br.readLine();
			int tmp=-1;
			for(int j=0;j<str.length();j++){
				if(apb[str.charAt(j)-97]==false) {
					apb[str.charAt(j)-97]=true;
					tmp=str.charAt(j)-97;
				}else {
					if(str.charAt(j)-97!=tmp) continue a;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}