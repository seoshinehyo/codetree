import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int current = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            for (int j = 0; j < x; j++) {
                int next = dir.equals("R") ? current + 1 : current - 1;
                int key = Math.min(current, next);
                map.put(key, map.getOrDefault(key, 0) + 1);
                current = next;
            }
        }

        int result = 0;
        for (int visits : map.values()) {
            if (visits >= 2) result++;
        }

        System.out.print(result);
    }
}
