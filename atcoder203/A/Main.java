package atcoder203.A;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            System.out.println(c);
        }
        else if (b == c) {
            System.out.println(a);
        }
        else if (c == a) {
            System.out.println(b);
        }
        else {
            System.out.println(0);
        }
    }
}