package study.programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrangeStringsArbitrarily {

    public static void main(String[] args) {
        ArrangeStringsArbitrarily t = new ArrangeStringsArbitrarily();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int n = sc.nextInt();
        for (String x : t.solution(str, n)) {
            System.out.println(x);
        }
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            arr.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1);
        }
        return answer;
    }

}