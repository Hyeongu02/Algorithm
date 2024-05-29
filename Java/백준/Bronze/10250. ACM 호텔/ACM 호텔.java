import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int h = in.nextInt();
            int w = in.nextInt();
            int n = in.nextInt();
            
            int floor, roomNumber;
            if (n % h == 0) {
                floor = h;
                roomNumber = n / h;
            } else {
                floor = n % h;
                roomNumber = n / h + 1;
            }
            
            System.out.printf("%d%02d\n", floor, roomNumber);
        }
        in.close();
    }
}