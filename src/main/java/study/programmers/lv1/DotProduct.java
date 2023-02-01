package study.programmers.lv1;

import java.util.Scanner;

public class DotProduct {

    public int solution(int n, int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }

        return result;

//        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }

    public static void main(String[] args) {
        DotProduct T = new DotProduct();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, a, b));
    }


}
