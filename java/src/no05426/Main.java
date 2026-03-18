package no05426;

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

    int t = Integer.parseInt(st.nextToken());
    for (int i = 0; i < t; i++) {
      StringBuilder sb = new StringBuilder();
      String msg = new StringTokenizer(br.readLine()).nextToken();
      int len = (int) Math.sqrt(msg.length());

      for (int j = len - 1; j > -1; j--) {
        for (int k = 0; k < len; k++) {
          sb.append(msg.charAt(k * len + j));
        }
      }
    System.out.println(sb);
    }
  }
}
