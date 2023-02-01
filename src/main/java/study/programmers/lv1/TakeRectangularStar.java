package study.programmers.lv1;

import java.util.Scanner;

public class TakeRectangularStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        StringBuilder sb = new StringBuilder();
//        IntStream.range(0, a).forEach(s -> sb.append("*"));
//        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }

}