import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] target= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String str=br.readLine();
		for(int i=0;i<target.length;i++) {
			str=str.replaceAll(target[i], "0");
		}
		System.out.println(str.length());
	}
}