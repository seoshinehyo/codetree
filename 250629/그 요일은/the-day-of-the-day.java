import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        String target = br.readLine().trim();

        int[] mdays = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Map<String,Integer> widx = new HashMap<>();
        widx.put("Mon", 0);
        widx.put("Tue", 1);
        widx.put("Wed", 2);
        widx.put("Thu", 3);
        widx.put("Fri", 4);
        widx.put("Sat", 5);
        widx.put("Sun", 6);

        int startOrd = 0, endOrd = 0;
        for (int m = 1; m < m1; m++) startOrd += mdays[m];
        startOrd += d1;
        for (int m = 1; m < m2; m++) endOrd += mdays[m];
        endOrd += d2;

        int startW = 0;
        int tgtW = widx.get(target);

        int offset = (tgtW - startW + 7) % 7;
        int firstOrd = startOrd + offset;

        int count;
        if (firstOrd > endOrd) {
            count = 0;
        } else {
            count = 1 + (endOrd - firstOrd) / 7;
        }

        System.out.println(count);
    }
}
