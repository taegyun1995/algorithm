package study.baekjoon.lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class _06오븐시계 {

    public static void main(String[] args) {
        _06오븐시계 t = new _06오븐시계();
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        for (Integer x : t.solution(h, m, s)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int h, int m, int s) {
        ArrayList<Integer> answer = new ArrayList<>();

        int min = 60 * h + m;
        min += s;

        int hour = (min / 60) % 24;
        int minute = min % 60;
        answer.add(hour);
        answer.add(minute);

        return answer;
    }

}