import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int days = 0;

        if (m1 == m2) {
            days = d2 - d1 + 1;
        } else {
            days += num_of_days[m1] - d1 + 1;
            for (int m = m1 + 1; m < m2; m++) {
                days += num_of_days[m];
            }
            days += d2;
        }
        System.out.println(days);
    }
}
