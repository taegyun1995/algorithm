package study.programmers.lv1.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _006자릿수더하기 {

    public static void main(String[] args) throws IOException {
        _006자릿수더하기 t = new _006자릿수더하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        for (String x : String.valueOf(n).split("")) {
            answer += Integer.parseInt(x);
        }

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }

}