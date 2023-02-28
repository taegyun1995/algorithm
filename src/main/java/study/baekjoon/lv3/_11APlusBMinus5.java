package study.baekjoon.lv3;

import java.util.Scanner;

public class _11APlusBMinus5 {

    public static void main(String[] args) {
        _11APlusBMinus5 t = new _11APlusBMinus5();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                sc.close();
                break;
            }

            System.out.println(a + b);
        }
    }

}