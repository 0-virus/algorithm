package no13300;

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
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][6];
        for (int i = 0; i < n; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(s.nextToken());
            int grade = Integer.parseInt(s.nextToken()) - 1;
            arr[sex][grade]++;
        }

        int ans = 0;
        for (int[] sub : arr) {
            for (int elem : sub) {
                ans += elem / k + (elem % k == 0 ? 0 : 1);
            }
        }

        System.out.print(ans);
    }
}
