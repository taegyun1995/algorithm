package study.inflearn.Array;

import java.util.Scanner;

public class ScissorsRockPaper {

    public static void main(String[] args) {
        ScissorsRockPaper T = new ScissorsRockPaper();
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
        for (char x : T.solution(n, a, b)) {
            System.out.println(x);
        }
    }

    public char[] solution(int n, int[] a, int[] b) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            if (a[i] == 1 && b[i] == 3 || a[i] == 2 && b[i] == 1 || a[i] == 3 && b[i] == 2) {
                answer[i] = 'A';
            } else if (a[i] == b[i]) {
                answer[i] = 'D';
            } else {
                answer[i] = 'B';
            }
        }

        return answer;
    }

}
