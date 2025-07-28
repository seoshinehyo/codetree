import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] aT = new int[N];
        char[] aD = new char[N];
        int totalA = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            aT[i] = Integer.parseInt(st.nextToken());
            aD[i] = st.nextToken().charAt(0);
            totalA += aT[i];
        }

        int[] bT = new int[M];
        char[] bD = new char[M];
        int totalB = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            bT[i] = Integer.parseInt(st.nextToken());
            bD[i] = st.nextToken().charAt(0);
            totalB += bT[i];
        }

        int totalTime = Math.max(totalA, totalB);

        int ai = 0, bi = 0;
        int aRem = (N > 0 ? aT[0] : 0);
        int bRem = (M > 0 ? bT[0] : 0);
        int aPos = 0, bPos = 0;
        boolean prevSame = true;
        int meetCount = 0;

        for (int time = 1; time <= totalTime; time++) {
            if (aRem == 0 && ai + 1 < N) {
                ai++;
                aRem = aT[ai];
            }
            if (aRem > 0) {
                aPos += (aD[ai] == 'R' ? 1 : -1);
                aRem--;
            }
            if (bRem == 0 && bi + 1 < M) {
                bi++;
                bRem = bT[bi];
            }
            if (bRem > 0) {
                bPos += (bD[bi] == 'R' ? 1 : -1);
                bRem--;
            }

            boolean same = (aPos == bPos);
            if (same && !prevSame) {
                meetCount++;
            }
            prevSame = same;
        }

        System.out.println(meetCount);
    }
}
