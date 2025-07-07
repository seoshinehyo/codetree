import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> cnt = new HashMap<>();
        int current = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            if (dir.equals("R")) {
                for (int j = 0; j < x; j++) {
                    current++;
                    cnt.put(current, cnt.getOrDefault(current, 0) + 1);
                }
            } else {
                for (int j = 0; j < x; j++) {
                    current--;
                    cnt.put(current, cnt.getOrDefault(current, 0) + 1);
                }
            }
        }

        long result = cnt.values().stream().filter(v -> v >= 2).count();
        System.out.print(result);
    }
}
