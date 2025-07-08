import java.util.*;
import java.io.*;

public class Main {

    static class TileStats { // 클래스로 담기
        int whiteCount = 0;
        int blackCount = 0;
        int lastColor = 0;
        boolean gray = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Map<Integer, TileStats> map = new HashMap<>();

        int current = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            int start = current;
            for (int j = 0; j < x; j++) {
                int pos = start + (dir.equals("R") ? j : -j);

                TileStats stats = map.get(pos);
                if (stats == null) {
                    stats = new TileStats();
                    map.put(pos, stats);
                }

                if (stats.gray) {
                    continue;
                }

                if (dir.equals("L")) {
                    stats.whiteCount++;
                    stats.lastColor = 1; // 1이면 흰색
                } else {
                    stats.blackCount++;
                    stats.lastColor = 2; // 2면 검은색
                }

                if (stats.whiteCount >= 2 && stats.blackCount >= 2) {
                    stats.gray = true;
                }
            }

            current = start + (dir.equals("R") ? (x - 1) : -(x - 1));
        }

        int white = 0, black = 0, gray = 0;
        for (TileStats stats : map.values()) {
            if (stats.gray) {
                gray++;
            } else if (stats.lastColor == 1) {
                white++;
            } else {
                black++;
            }
        }

        System.out.println(white + " " + black + " " + gray);
    }
}
