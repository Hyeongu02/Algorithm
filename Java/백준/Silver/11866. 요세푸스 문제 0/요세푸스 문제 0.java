import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int k=Integer.parseInt(input[1]);
		LinkedList<Integer> list =new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(i+1);
		}
		int tmp=0;
		StringBuilder sb=new StringBuilder("<");
		while (list.size()>1) {
			tmp=(tmp+k-1)%list.size();
			sb.append(list.remove(tmp)).append(", ");
		}
		sb.append(list.remove(0)).append(">");
		System.out.println(sb);
	}
}
