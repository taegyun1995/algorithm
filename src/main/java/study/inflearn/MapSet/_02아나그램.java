package study.inflearn.MapSet;

import java.util.HashMap;
import java.util.Scanner;

public class _02아나그램 {

    public static void main(String[] args) {
        _02아나그램 t = new _02아나그램();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(t.solution(s1, s2));
    }

    public String solution(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (Character x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Character x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        return map.equals(map2) ? "YES" : "NO";
    }

    public String solution2(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

}