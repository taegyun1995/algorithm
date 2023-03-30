package study.inflearn.MapSet;

import java.util.HashMap;
import java.util.Scanner;

public class _04모든아나그램찾기 {

    public static void main(String[] args) {
        _04모든아나그램찾기 t = new _04모든아나그램찾기();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(t.solution(s1, s2));
    }

    public int solution(String s1, String s2) {
        int answer = 0;

        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : s2.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        HashMap<Character, Integer> am = new HashMap<>();
        for (int i = 0; i < s2.length() - 1; i++) {
            am.put(s1.charAt(i), am.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = s2.length() - 1; rt < s1.length(); rt++) {
            am.put(s1.charAt(rt), am.getOrDefault(s1.charAt(rt), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(s1.charAt(lt), am.get(s1.charAt(lt)) - 1);
            if (am.get(s1.charAt(lt)) == 0) {
                am.remove(s1.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

}