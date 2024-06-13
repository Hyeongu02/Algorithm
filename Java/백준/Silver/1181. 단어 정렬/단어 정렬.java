import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        Collections.sort(list);
        List<String> result = list.stream()
                                  .distinct()
                                  .sorted((a, b) -> a.length() - b.length())
                                  .collect(Collectors.toList());
        for (int i = 0; i < result.size(); i++) {
            bw.append(result.get(i) + '\n');
        }
        bw.flush();
        bw.close();
    }
}
