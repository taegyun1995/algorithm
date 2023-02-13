package study.inflearn.String;

import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {
        Encrypt t = new Encrypt();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(t.solution(n, s));
    }

    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }


        return answer;
    }

}
