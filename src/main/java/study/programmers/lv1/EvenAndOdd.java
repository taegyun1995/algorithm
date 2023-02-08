package study.programmers.lv1;

import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {
        EvenAndOdd t = new EvenAndOdd();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public String solution(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

}