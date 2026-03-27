package no04619;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    solution();
  }

  static void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();
    while (true) {
      st = new StringTokenizer(br.readLine());
      double b = Double.parseDouble(st.nextToken());
      double n = Double.parseDouble(st.nextToken());
      if (b == 0.0 && n == 0.0) break;
      
      double a = Math.pow(b, 1 / n);
      int ceiled = (int) Math.ceil(a);
      int floored = (int) Math.floor(a);
      if (Math.pow(floored, n) + Math.pow(ceiled, n) >= 2 * b) {
        a = floored;
      } else a = ceiled;
      sb.append((int) Math.ceil(a)).append("\n");
    }

    System.out.print(sb);
  }

  static double baseLog(double a, double b) {
    return Math.log10(b) / Math.log10(a);
  }
}
