package study.baekjoon.lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class _05알람시계 {

    public static void main(String[] args) {
        _05알람시계 t = new _05알람시계();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (Integer x : t.solution(a, b)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int a, int b) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (b < 45) {
            a--;
            b = 60 - (45 - b);
            if (a < 0) {
                a = 23;
            }
            answer.add(a);
            answer.add(b);
        } else {
            answer.add(a);
            answer.add(b - 45);
        }
        return answer;
    }

}