package no34553;

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

    String s = st.nextToken();

    int ans = 1, score = 1;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) > s.charAt(i - 1)) score++;
      else score = 1;
      ans += score;
    }
    
    System.out.print(ans);
  }
}
