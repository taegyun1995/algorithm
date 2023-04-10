package study.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _009자연수뒤집어배열로만들기 {

    public static void main(String[] args) throws IOException {
        _009자연수뒤집어배열로만들기 t = new _009자연수뒤집어배열로만들기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        for (int x : t.solution(n)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int cnt = 0;
        while (n > 0) {
            answer[cnt] = (int) (n % 10);
            n = n / 10;
            cnt++;
        }

        return answer;
    }

    public ArrayList<Integer> solution2(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] chars = new StringBuffer(String.valueOf(n)).reverse().toString().split("");
        for (String x : chars) {
            answer.add(Integer.parseInt(x));
        }
        return answer;
    }

    public int[] solution3(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

}