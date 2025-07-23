import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> aList = new ArrayList<>();
        int aPos = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < t; j++) {
                if (d.equals("R")) {
                    aPos++;
                }
                else {
                    aPos--;
                }
                aList.add(aPos);
            }
        }

        int bPos = 0;
        int time = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < t; j++) {
                if (d.equals("R")) {
                    bPos++;
                }
                else {
                    bPos--;
                }
                time++;
                if (time <= aList.size() && aList.get(time - 1) == bPos) {
                    System.out.println(time);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
