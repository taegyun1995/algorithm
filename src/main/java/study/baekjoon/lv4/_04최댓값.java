package study.baekjoon.lv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04최댓값 {

    public static void main(String[] args) {
        _04최댓값 t = new _04최댓값();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : t.solution(arr)) {
            System.out.println(x);
        }
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = Arrays.stream(arr).max().getAsInt();
        answer.add(max);
        int cnt = 0;
        for (int x : arr) {
            cnt++;
            if (x == max) {
                break;
            }
        }
        answer.add(cnt);
        return answer;
    }

}