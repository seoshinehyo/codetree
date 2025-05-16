import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int lcmArray(int[] arr, int idx) {
        if (idx == 0) {
            return arr[0];
        }
        int prevLcm = lcmArray(arr, idx - 1);
        return lcm(prevLcm, arr[idx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result = lcmArray(arr, n - 1);
        System.out.println(result);
    }
}
