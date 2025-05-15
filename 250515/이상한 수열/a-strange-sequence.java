import java.util.Scanner;
public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        System.out.print(getN(n));
    }

    public static int getN(int n) {
        if (n == 1) {
            return arr[n] = 1;
        }
        if (n == 2) {
            return arr[n] = 2;
        }
        if (arr[n] != 0) {
            return 0;
        }
        arr[n] = getN(n / 3) + getN(n - 1);
        return arr[n];
    }
}