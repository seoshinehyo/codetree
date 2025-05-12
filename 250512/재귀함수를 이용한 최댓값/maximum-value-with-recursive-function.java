import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(getMax(arr, n - 1));
    }

    public static int getMax(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        int max = getMax(arr, index - 1);
        return Math.max(arr[index], max);
    }
}