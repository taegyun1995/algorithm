package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _013두정수사이의합 {

    public static void main(String[] args) throws IOException {
        _013두정수사이의합 t = new _013두정수사이의합();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.print(t.solution2(a, b));
    }

    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }

        return answer;
    }

    public long solution2(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(a, b));
    }

    public long sumAtoB(int a, int b) {
        long sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

}