import java.util.Scanner;
public class Main {
    static int[] memo = new int[21];

    public static int getN(int n) {
        if (n == 1) return 2;
        if (n == 2) return 4;
        if (memo[n] != 0) return memo[n];

        memo[n] = (getN(n - 1) * getN(n - 2)) % 100;
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getN(n));
    }
}