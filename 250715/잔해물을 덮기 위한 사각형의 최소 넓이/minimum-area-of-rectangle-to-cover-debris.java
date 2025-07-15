import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int OFFSET = 1000;
        final int SIZE = 2 * OFFSET + 1;
        int[][] arr = new int[SIZE][SIZE];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        for (int x = x1 + OFFSET; x < x2 + OFFSET; x++) {
            for (int y = y1 + OFFSET; y < y2 + OFFSET; y++) {
                arr[x][y] = 1;
            }
        }

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());            
        int y4 = Integer.parseInt(st.nextToken());

        for (int x = x3 + OFFSET; x < x4 + OFFSET; x++) {
            for (int y = y3 + OFFSET; y < y4 + OFFSET; y++) {
                arr[x][y] = 0;
            }
        }

        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j] == 1) {
                    xMax = Math.max(xMax, i);
                    xMin = Math.min(xMin, i);
                    yMax = Math.max(yMax, j);
                    yMin = Math.min(yMin, j);
                }
            }
        }

        System.out.println((xMax - xMin + 1) * (yMax - yMin + 1));
    }
}
