package atcoder203.B;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                sum += 100 * i + j;
            }
        }
        System.out.println(sum);
    }
}
