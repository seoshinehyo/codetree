import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.substring(0,t.length()).equals(t)) {
                list.add(str);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(k - 1));
    }
}