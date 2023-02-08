package study.programmers.lv1;

import java.util.Scanner;

public class AddDigits {

    public static void main(String[] args) {
        AddDigits t = new AddDigits();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        String[] s = String.valueOf(n).split("");
        for (String x : s) {
            answer += Integer.parseInt(x);
        }
        return answer;

//        int answer = 0;
//        while (n != 0) {
//            answer += n % 10;
//            n /= 10;
//        }
//        return answer;
    }

}