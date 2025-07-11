import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        final int OFFSET = 100;
        int[][] arr = new int[n + OFFSET][n + OFFSET];
        

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    arr[j][k] += 1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < n + OFFSET; i++) {
            for (int j = 0; j < n + OFFSET; j++) {
                if (arr[i][j] >= 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}