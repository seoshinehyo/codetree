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
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < t; j++) {
                aPos += v;
                aList.add(aPos);
            }
        }

        int leader = 0;
        int changes = 0;
        int bPos = 0;
        int time = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < t; j++) {
                bPos += v;
                time++;
                int aP = aList.get(time - 1);

                int candidate;
                if (aP > bPos) {
                    candidate = 1;
                }         
                else if (bPos > aP) {
                    candidate = 2;
                }
                else {
                    candidate = leader;
                }

                if (candidate != leader) {
                    if (leader != 0) {
                        changes++;
                    }
                    leader = candidate;
                }
            }
        }

        System.out.println(changes);
    }
}
