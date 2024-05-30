import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int count5 = 0;
        for (int i = 5; i <= n; i *= 5) {
            count5 += n / i;
        }
        
        System.out.println(count5);
    }
}