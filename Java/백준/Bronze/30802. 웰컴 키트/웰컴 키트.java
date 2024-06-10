import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String[] size=br.readLine().split(" ");
		String[] bundle=br.readLine().split(" ");
		int sum=0;
		for(int i=0;i<size.length;i++) {
			if(Integer.parseInt(size[i])>0) {
				sum++;
				if(size[i].equals(bundle[0])) continue;
				if(Integer.parseInt(size[i])%Integer.parseInt(bundle[0])==0) {
					sum+=Integer.parseInt(size[i])/Integer.parseInt(bundle[0])-1;
				}else {
					sum+=Integer.parseInt(size[i])/Integer.parseInt(bundle[0]);
				}
			}
		}
		bw.append(Integer.toString(sum)+'\n');
		bw.append(Integer.toString(n/Integer.parseInt(bundle[1]))+" ");
		bw.append(Integer.toString(n%Integer.parseInt(bundle[1])));
		bw.flush();
		bw.close();
	}
}