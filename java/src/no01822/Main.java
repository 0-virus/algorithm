package no01822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        solution();
    }

    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int na = Integer.parseInt(st.nextToken());
        int nb = Integer.parseInt(st.nextToken());
        
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < na; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nb; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }
        a.removeAll(b);

        List<Integer> list = new ArrayList<>(a);
        Collections.sort(list);
        System.out.println(list.size());
        StringBuilder sb = new StringBuilder();
        for (int elem : list) sb.append(elem).append(" ");
        System.out.print(sb);
    }
}
