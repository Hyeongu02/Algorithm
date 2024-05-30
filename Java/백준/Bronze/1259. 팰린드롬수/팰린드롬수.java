import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader  sb= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringBuffer str=new StringBuffer(sb.readLine());
			if(str.toString().equals("0")) break;
			String strClone1=str.substring(0, str.length()/2);
			String strClone2=(str.reverse().substring(0, str.length()/2));
			if(strClone1.equals(strClone2)) System.out.println("yes");
			else System.out.println("no");
		}
	}
}