package study.inflearn.String;

import java.util.Scanner;

public class _12암호 {

    public static void main(String[] args) {
        _12암호 t = new _12암호();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(t.solution(n, s));
    }

    public String solution(int n, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            sb.append((char)num);
            s = s.substring(7);
        }

        return sb.toString();
    }

}
