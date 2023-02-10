package study.programmers.lv1;

import java.util.Scanner;

public class HidePhoneNumber {

    public static void main(String[] args) {
        HidePhoneNumber t = new HidePhoneNumber();
        Scanner sc = new Scanner(System.in);
        String phone_number = sc.next();
        System.out.println(t.solution(phone_number));
    }

    public String solution(String phone_number) {
        String answer = "";
        int count = 0;
        char[] chars = phone_number.toCharArray();
        for (char x : chars) {
            if (count < phone_number.length() - 4) {
                answer += "*";
                count++;
            } else {
                answer += x;
            }
        }
        return answer;
    }

    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    public String solution3(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

}