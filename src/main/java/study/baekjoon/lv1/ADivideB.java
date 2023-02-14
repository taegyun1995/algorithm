package study.baekjoon.lv1;

import java.util.Scanner;

public class ADivideB {

    public static void main(String[] args) {
        ADivideB t = new ADivideB();
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(t.solution(a, b));
    }

    public double solution(double a, double b) {
        return a / b;
    }

}