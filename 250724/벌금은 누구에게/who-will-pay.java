import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[tmp - 1]++;

            if (arr[tmp - 1] >= k) {
                System.out.println(tmp);
                return;
            }
        }

        System.out.println(-1);
    }
}
