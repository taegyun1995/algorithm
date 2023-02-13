package study.inflearn.Array;

import java.util.Scanner;

public class VisibleStudent {

    public static void main(String[] args) {
        VisibleStudent T = new VisibleStudent();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }

    public int solution(int n, int[] arr) {
        int cnt = 1;
        int tmp = arr[0];
        for (int i = 1; i < n; i++) {
            if (tmp < arr[i]) {
                cnt++;
                tmp = arr[i];
            }
        }
        return cnt;
    }

}