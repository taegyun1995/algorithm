package study.inflearn.Array;

import java.util.Scanner;

public class GetRank {

    public static void main(String[] args) {
        GetRank t = new GetRank();
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

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

}