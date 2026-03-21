package no17874;

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
    int h = Integer.parseInt(st.nextToken());
    int v = Integer.parseInt(st.nextToken());

    System.out.print(Math.max(h, n - h) * Math.max(v, n - v) * 4);
  }
}
