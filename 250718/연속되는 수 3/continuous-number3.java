import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        final int OFFSET = 1000;
        final int SIZE = OFFSET * 2 + 1;
        int[] arr = new int[SIZE];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {
            if ((arr[i] * arr[i - 1]) > 0) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        max = Math.max(max, count);
        System.out.println(max);
    }
}
