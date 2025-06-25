import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int start = 11 + 11 * 60 + 11 * 24 * 60;
        int end = C + B * 60 + A * 24 * 60;
        int diff = 0;

        if (start < end) {
            diff = end - start;
        } else if (start == end) {
            diff = 0;
        } else {
            diff = -1;
        }

        System.out.print(diff);
    }
}
