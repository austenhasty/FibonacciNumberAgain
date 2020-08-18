import java.util.Scanner;

public class FibonacciNumberAgain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long m = s.nextInt();
        System.out.println(fibonacciAgain(n, m));
    }

    public static long fibonacciAgain(long n, long m) {
        int prev = 1;
        int current = 1;
        if (n <= 1) {
            return n;
        } else {
            for (int i = 2; i < ; i++) {
                int temp = prev;
                prev = current;
                current = current + temp;
            }
        }
        return current % b;
    }
}
