import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        final int OFFSET = 100;
        final int SIZE = 201;
        int[] arr = new int[SIZE];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            
            for (int j = x1; j < x2; j++) {
                arr[j + OFFSET]++;
            }
        }

        int max = 0;
        for (int count : arr) {
            if (count > max) {
                max = count;
            }
        }

        System.out.print(max);
    }
}
