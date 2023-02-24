package study.baekjoon.lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class _05코딩은체육과목 {

    public static void main(String[] args) {
        _05코딩은체육과목 t = new _05코딩은체육과목();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (String x : t.solution(n)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<String> solution(int n) {
        ArrayList<String> answer = new ArrayList<>();
        int cnt = n / 4;
        for (int i = 0; i < cnt; i++) {
            answer.add("long");
        }
        answer.add("int");

        return answer;
    }

}