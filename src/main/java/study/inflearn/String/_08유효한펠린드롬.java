package study.inflearn.String;

import java.util.Scanner;

public class _08유효한펠린드롬 {

    public static void main(String[] args) {
        _08유효한펠린드롬 t = new _08유효한펠린드롬();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) {
            return "YES";
        }

        return "NO";
    }

}
