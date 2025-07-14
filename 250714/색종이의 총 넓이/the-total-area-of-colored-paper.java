import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int OFFSET = 100;
        final int SIZE = 2 * OFFSET + 1;
        int[][] arr = new int[SIZE][SIZE];
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            for (int x = x1 + OFFSET; x < x1 + 8 + OFFSET; x++) {
                for (int y = y1 + OFFSET; y < y1 + 8 + OFFSET; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
