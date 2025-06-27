import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;

        for (int i = 1; i <= m1; i++) {
            if (i == m1) {
                start += d1;
                break;
            }
            start += num_of_days[i];
        }

        for (int i = 1; i <= m2; i++) {
            if (i == m2) {
                end += d2;
                break;
            }
            end += num_of_days[i];
        }

        int diff = (end - start) % 7;

        System.out.print(months[(diff + 7) % 7]);
    }
}
