import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, h, w);
        }

        Arrays.sort(students, (a, b) -> a.h - b.h);
        
        for (Student s : students) {
            System.out.println(s.name + " " + s.h + " " + s.w);
        }
    }
}

class Student {
    String name;
    int h;
    int w;

    public Student(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}