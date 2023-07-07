package study.programmers.lv1.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _005x만큼간격이있는n개의숫자 {

    public static void main(String[] args) throws IOException {
        _005x만큼간격이있는n개의숫자 t = new _005x만큼간격이있는n개의숫자();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (long k : t.solution(x, n)) {
            System.out.print(k + " ");
        }
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }

    public ArrayList<Long> solution2(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        long sum = x;
        for (int i = 0; i < n; i++) {
            answer.add(sum);
            sum += x;
        }

        return answer;
    }

}