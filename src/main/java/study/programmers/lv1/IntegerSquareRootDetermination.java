package study.programmers.lv1;

import java.util.Scanner;

public class IntegerSquareRootDetermination {

    public static void main(String[] args) {
        IntegerSquareRootDetermination t = new IntegerSquareRootDetermination();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(t.solution(n));
    }

    public long solution(long n) {
        return Math.pow(Math.sqrt(n), 2) == n ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }

    public long solution2(long n) {
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }

}