package study.baekjoon.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class _06FourArithmeticOperations {

    public static void main(String[] args) {
        _06FourArithmeticOperations t = new _06FourArithmeticOperations();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int x : t.solution(a, b)) {
            System.out.println(x);
        }
    }

    public ArrayList<Integer> solution(int a, int b) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(a + b);
        answer.add(a - b);
        answer.add(a * b);
        answer.add(a / b);
        answer.add(a % b);
        return answer;
    }

}