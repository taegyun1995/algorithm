package study.programmers;

import java.util.Scanner;

public class CommonFactorAndMultiple {

    public static void main(String[] args) {
        CommonFactorAndMultiple T = new CommonFactorAndMultiple();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(T.solution(n, m));
    }

    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return new int[]{a, n * m / a};
    }

}
