package study.baekjoon.lv3;

import java.util.Scanner;

public class _01구구단 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

}