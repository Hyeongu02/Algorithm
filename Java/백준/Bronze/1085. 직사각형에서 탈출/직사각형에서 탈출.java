import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int arr[]= {Math.abs(Integer.parseInt(str[0])-0),Math.abs(Integer.parseInt(str[1])-0),
				Math.abs(Integer.parseInt(str[2])-Integer.parseInt(str[0])),Math.abs(Integer.parseInt(str[3])-Integer.parseInt(str[1]))};
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}