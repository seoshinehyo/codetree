import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[2 * n];
        int[] B = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        for (int i = 0; i < n; i++) {
            B[i] = A[i] + A[2 * n - i - 1];
        }

        int max = Arrays.stream(B).max().getAsInt();
        System.out.print(max);
    }
}