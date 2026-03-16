package no13171;

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

        int n = Integer.parseInt(st.nextToken());
        int sum = 0, largest = 0;
        String largestName = "";

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            int possible = 0;
            while (i2 / i1 > 0) {
                int share = i2 / i1;
                possible += share;
                i2 = i2 % i1 + 2 * share;
            }

            sum += possible;
            if (possible > largest) {
                largest = possible;
                largestName = name;
            }
        }

        System.out.println(sum);
        System.out.println(largestName);
    }
}
