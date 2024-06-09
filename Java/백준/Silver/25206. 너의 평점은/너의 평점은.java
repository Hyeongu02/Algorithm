import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double sum=0;
		int credit=0;
		for(int i=0;i<20;i++) {
			String[] str=br.readLine().split(" ");
			if(str[2].equals("P")) continue;
			if(str[2].equals("F")){
				credit+=str[1].charAt(0)-'0';
				continue;
			}
			double grade=69-str[2].charAt(0);
			if(str[2].charAt(1)=='+') grade +=0.5;
			sum += (str[1].charAt(0)-'0') *grade;
			credit+=str[1].charAt(0)-'0';
		}
		System.out.println(sum/credit);
	}
}