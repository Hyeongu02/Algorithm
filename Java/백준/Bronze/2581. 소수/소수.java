import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();
        
        boolean[] prime = new boolean[n + 1];
        // 초기값 설정: 모든 수를 소수로 간주 (false가 소수를 의미)
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        
        // 에라토스테네스의 체
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        int sum = 0;
        int min = n + 1;
        
        for (int i = m; i <= n; i++) {
            if (prime[i]) {
                sum += i;
                if (min == n + 1) {
                    min = i;
                }
            }
        }
        
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
