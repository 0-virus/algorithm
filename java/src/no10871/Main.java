package no10871;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st2.nextToken());
			if (num < x)
				ans.append(num).append(' ');
		}

		System.out.print(ans);
	}
}
