package no04375;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        solution();
    }

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s=br.readLine()) != null) {
            int n = Integer.parseInt(s);
            int base = 0;
            int ans = 0;
            while (true) {
                ans++;
                base = (base * 10 + 1) % n;
                if (base == 0) {
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}
