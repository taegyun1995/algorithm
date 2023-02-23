package study.inflearn.Array;

import java.util.Scanner;

public class _02보이는학생 {

    public static void main(String[] args) {
        _02보이는학생 T = new _02보이는학생();
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
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (min < arr[i]) {
                cnt++;
                min = arr[i];
            }
        }
        
        return cnt;
    }

}