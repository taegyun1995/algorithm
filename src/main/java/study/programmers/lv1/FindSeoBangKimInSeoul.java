package study.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class FindSeoBangKimInSeoul {

    public static void main(String[] args) {
        FindSeoBangKimInSeoul t = new FindSeoBangKimInSeoul();
        Scanner sc = new Scanner(System.in);
        String[] seoul = sc.nextLine().split(" ");
        System.out.println(t.solution(seoul));

    }

    public String solution(String[] seoul) {
        int count = 0;
        for (String s : seoul) {
            if (s.equals("Kim")) {
                break;
            }
            count++;
        }
        return "김서방은 " + count + "에 있다";
    }

    public String solution2(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }

}