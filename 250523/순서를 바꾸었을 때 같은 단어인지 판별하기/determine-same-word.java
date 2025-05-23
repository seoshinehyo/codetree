import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String a = br.readLine();
        String b = br.readLine();
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);

        String sortedA = new String(A);
        String sortedB = new String(B);

        if (sortedA.equals(sortedB)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}