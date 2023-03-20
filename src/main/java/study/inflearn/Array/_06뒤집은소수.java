package study.inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _06뒤집은소수 {

    public static void main(String[] args) {
        _06뒤집은소수 T = new _06뒤집은소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(arr[i])).reverse();
            answer.add(Integer.parseInt(sb.toString()));
        }
        for (Integer x : answer) {
            if (isPrime(x)) {
                result.add(x);
            }
        }

        return result;
    }

}
