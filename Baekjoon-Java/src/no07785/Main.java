package no07785;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) throws Exception {
    solution();
  }

  static void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    TreeSet<String> entered = new TreeSet<>();
    int n = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      String name = st.nextToken();
      String log = st.nextToken();

      if (log.equals("enter")) {
        entered.add(name);
      } else {
        entered.remove(name);
      }  
    }

    while (!entered.isEmpty()) {
      String last = entered.last();
      sb.append(last).append("\n");
      entered.remove(last);
    }
    System.out.print(sb);
  }
}
