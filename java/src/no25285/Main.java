package no25285;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        solution();
    }

    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            int grade = 0;
            st = new StringTokenizer(br.readLine());
            double h = Integer.parseInt(st.nextToken());
            double w = Integer.parseInt(st.nextToken());
            double bmi = w / Math.pow(h / 100, 2);

            grade = h < 140.1 ? 6 :
                    h < 146.0 ? 5 :
                    h < 159.0 ? 4 :
                    h < 161.0 ? (bmi < 16.0 || bmi >= 35.0 ? 4 : 3) :
                    h < 204.0 ? (bmi < 16.0 || bmi >= 35.0 ? 4 :
                                 bmi < 18.5 || bmi >= 30.0 ? 3 :
                                 bmi < 20.0 || bmi >= 25.0 ? 2 : 1) : 4;

            sb.append(grade).append("\n");
        }
        System.out.print(sb);
    }
}
