package study.inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class _03가위바위보 {

    public static void main(String[] args) {
        _03가위바위보 T = new _03가위바위보();
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

    public ArrayList<Character> solution(int n, int[] a, int[] b) {
        ArrayList<Character> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2)) {
                answer.add('A');
            } else if (a[i] == b[i]) {
                answer.add('D');
            } else {
                answer.add('B');
            }
        }

        return answer;
    }

}
