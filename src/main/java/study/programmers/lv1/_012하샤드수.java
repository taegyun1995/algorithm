package study.programmers.lv1;

import java.util.Scanner;

public class _012하샤드수 {

    public static void main(String[] args) {
        _012하샤드수 t = new _012하샤드수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public boolean solution(int n) {
        int sum = 0;
        String[] str = String.valueOf(n).split("");
        for (String x : str) {
            sum += Integer.parseInt(x);
        }

        return n % sum == 0;
    }

}