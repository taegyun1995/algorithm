package study.programmers.lv1;

import java.util.Scanner;

public class CollatzGuess {

    public static void main(String[] args) {
        CollatzGuess t = new CollatzGuess();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        long num = n;
        int answer = 0;

        while (num != 1) {
            if (answer > 500) {
                return -1;
            }
            answer++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
        }

        return answer;
    }

    public int solution2(int n) {
        long num = n;
        for (int i = 0; i < 500; i++) {
            if (num == 1) return i;
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
        }
        return -1;
    }


}