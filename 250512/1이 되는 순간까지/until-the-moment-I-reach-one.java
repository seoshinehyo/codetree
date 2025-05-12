import java.util.Scanner;
public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getCount(n);
        System.out.print(count);
    }

    public static void getCount(int n) {
        if (n == 1) {
            return;
        }
        count++;
        if (n % 2 == 0) {
            getCount(n / 2);
        } else {
            getCount(n / 3);
        }
    }
}