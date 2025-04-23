import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};

        String[] input = br.readLine().split(" ");
        boolean isAsc = true;
        boolean isDesc = true;

        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num != ascending[i]) isAsc = false;
            if (num != descending[i]) isDesc = false;
        }

        if (isAsc) {
            System.out.println("ascending");
        } else if (isDesc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
