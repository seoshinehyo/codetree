import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, String> map = new HashMap<>();
        int current = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            String color = dir.equals("R") ? "B" : "W";

            for (int j = 0; j < x; j++) {
                int pos = dir.equals("R") ? current + j : current - j;
                map.put(pos, color);
            }
            current = dir.equals("R") ? current + (x - 1) : current - (x - 1);
        }

        int wCount = 0, bCount = 0;
        for (String c : map.values()) {
            if (c.equals("W")) {
                wCount++;
            } else {
                bCount++;
            }
        }
        System.out.println(wCount + " " + bCount);
    }
}
