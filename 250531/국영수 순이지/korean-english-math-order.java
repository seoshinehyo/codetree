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
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students, (a, b) -> {
            if (a.kor != b.kor) {
                return b.kor - a.kor;
            }
            if (a.eng != b.eng) {
                return b.eng - a.eng;
            }
            return b.math - a.math;
        });

        for (Student s : students) {
            System.out.println(s.name + " " + s.kor + " " + s.eng + " " + s.math);
        }
    }
}

class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
