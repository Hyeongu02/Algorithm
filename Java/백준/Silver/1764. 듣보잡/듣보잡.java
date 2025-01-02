import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] parts = input.split(" ");
        int N = Integer.parseInt(parts[0]); // 첫 번째 숫자
        int M = Integer.parseInt(parts[1]); // 두 번째 숫자
		int count=0;
		HashMap<String, Boolean> target= new HashMap<String, Boolean>();
		for(int i=0; i<N; i++) {
			target.put(br.readLine(),false);
		}
		for(int j=0;j<M;j++) {
			String x=br.readLine();
			if(target.containsKey(x)) {
				count++;
				target.replace(x, true);
			}
		}
		System.out.println(count);
		List<String> keySet= new ArrayList<>(target.keySet());
		Collections.sort(keySet);
		for (String key : keySet) {
            if(target.get(key)) {
            	System.out.println(key);
            }
        }
	}
	
}

