package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _002약수의합 {

    public static void main(String[] args) throws IOException {
        _002약수의합 t = new _002약수의합();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer + n;
    }

}