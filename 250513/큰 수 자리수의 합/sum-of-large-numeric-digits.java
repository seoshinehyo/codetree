import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(getSum(a * b * c));
    }

    public static int getSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + getSum(n / 10);
    }
}