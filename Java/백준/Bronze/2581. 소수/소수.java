import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();

        int sum = 0;
        int min = -1;
        boolean[] prime = new boolean[n + 1];
        
        // Initialize 0 and 1 as not prime
        prime[0] = true;
        prime[1] = true;
        
        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        // Sum up primes and find the minimum prime in range [m, n]
        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                sum += i;
                if (min == -1) {
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
