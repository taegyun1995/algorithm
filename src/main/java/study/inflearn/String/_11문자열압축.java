package study.inflearn.String;

import java.util.Scanner;

public class _11문자열압축 {

    public static void main(String[] args) {
        _11문자열압축 t = new _11문자열압축();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(s.charAt(i));
                if (cnt > 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
            }
        }

        return sb.toString();
    }

}