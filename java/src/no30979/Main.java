package no30979;

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
    
    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());

    
    st = new StringTokenizer(br.readLine());
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += Integer.parseInt(st.nextToken());
    }
    System.out.print(t > total ? "Padaeng_i Cry" : "Padaeng_i Happy");
  }
}
