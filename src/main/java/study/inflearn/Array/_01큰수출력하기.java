package study.inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _01큰수출력하기 {

    public static void main(String[] args) {
        _01큰수출력하기 t = new _01큰수출력하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

}