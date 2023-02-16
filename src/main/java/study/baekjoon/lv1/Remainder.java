package study.baekjoon.lv1;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {
        Remainder t = new Remainder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int x : t.solution(a, b, c)) {
            System.out.println(x);
        }
    }

    public int[] solution(int a, int b, int c) {
        int[] answer = new int[4];
        answer[0] = (a + b) % c;
        answer[1] = (a % c) + (b + c) % c;
        answer[2] = (a * b) % c;
        answer[3] = (a % c) * (b % c) % c;
        return answer;
    }

}