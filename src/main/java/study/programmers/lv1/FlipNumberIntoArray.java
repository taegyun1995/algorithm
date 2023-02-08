package study.programmers.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipNumberIntoArray {

//    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    public static void main(String[] args) {
        FlipNumberIntoArray t = new FlipNumberIntoArray();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(t.solution(n));
    }

    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] chars = new StringBuffer(String.valueOf(n)).reverse().toString().split("");
        for (String x : chars) {
            answer.add(Integer.parseInt(x));
        }
        return answer;
    }

    public int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public int[] solution3(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];
        int cnt = 0;

        while (n > 0) {
            answer[cnt] = (int) (n % 10);
            n /= 10;
            cnt++;
        }
        return answer;
    }

}