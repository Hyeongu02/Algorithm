import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();
            
            int floor = (N % H == 0) ? H : N % H;
            int roomNumber = (N % H == 0) ? (N / H) : (N / H + 1);
            
            System.out.printf("%d%02d\n", floor, roomNumber);
        }
        
        scanner.close();
    }
}
