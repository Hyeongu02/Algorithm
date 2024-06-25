import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		int n= Integer.parseInt(br.readLine());
		int[] difficulty = new int[31];
		for(int i=0;i<n;i++) {
			difficulty[Integer.parseInt(br.readLine())]++;
		}
		int delete=(int)Math.round(n*0.15);
		int max=30;
		int min=1;
		for(int i=0;i<delete;i++) {
			while(difficulty[max]==0)max--;
			while(difficulty[min]==0)min++;
			difficulty[max]--;
			difficulty[min]--;
		}
		int sum=0;
		for(int i=min;i<=max;i++) {
			sum+=i*difficulty[i];
		}
		System.out.println(Math.round(sum/(n-delete*2.0)));
	}
}