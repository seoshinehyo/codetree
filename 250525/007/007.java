import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String sCode = st.nextToken();
        char mPoint = st.nextToken().charAt(0);
        int time = Integer.parseInt(st.nextToken());
        Secret secret = new Secret(sCode, mPoint, time);
        System.out.println("secret code : " + secret.sCode);
        System.out.println("meeting point : " + secret.mPoint);
        System.out.println("time : " + secret.time);
    }
}

class Secret {
    String sCode;
    char mPoint;
    int time;

    public Secret(String sCode, char mPoint, int time) {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}