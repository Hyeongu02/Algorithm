import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[8001];
        int max = -4000;
        int min = 4000;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            nums[input + 4000]++;
            if (input > max) max = input;
            if (input < min) min = input;
            sum += input;
        }

        // 최빈값
        int maxFrequency = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = min + 4000; i <= max + 4000; i++) {
            if (nums[i] > maxFrequency) {
                list.clear();
                maxFrequency = nums[i];
                list.add(i - 4000);
            } else if (nums[i] == maxFrequency) {
                list.add(i - 4000);
            }
        }
        Collections.sort(list); // 정렬한 뒤에 list size에 따라 출력

        // 중앙값
        int count = 0;
        int mid = 0;
        Loop: for (int i = min + 4000; i <= max + 4000; i++) {
            while (nums[i] != 0) {
                nums[i]--;
                count++;
                if (count == n / 2 + 1) {
                    mid = i - 4000;
                    break Loop;
                }
            }
        }

        // 출력
        System.out.println(Math.round(sum / (double) n));
        System.out.println(mid);
        if (list.size() > 1) System.out.println(list.get(1));
        else System.out.println(list.get(0));
        System.out.println(max - min);
    }
}
