package study.inflearn.MapSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class _05K번째큰수 {

    public static void main(String[] args) {
        _05K번째큰수 t = new _05K번째큰수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(t.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    ts.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : ts) {
            cnt++;
            if (cnt == k) {
                return x;
            }
        }

        return answer;
    }

}