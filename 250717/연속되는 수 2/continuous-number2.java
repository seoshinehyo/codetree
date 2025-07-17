import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] == arr[i - 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        System.out.println(max);
    }
}
