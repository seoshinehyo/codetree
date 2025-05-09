import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSquare(n);
    }

    public static void printSquare(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num++ + " ");
                if ((num % 10) == 0) {
                    num -= 9;
                }
            }
            System.out.println();
        }
    }
}