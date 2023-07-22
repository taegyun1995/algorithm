package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _012하샤드수 {

    public static void main(String[] args) throws IOException {
        _012하샤드수 t = new _012하샤드수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(t.solution(n));
    }

    public boolean solution(int n) {
        int sum = 0;
        String[] str = String.valueOf(n).split("");
        for (String x : str) {
            sum += Integer.parseInt(x);
        }

        return n % sum == 0;
    }

    public boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();

        return x % sum == 0;
    }

}