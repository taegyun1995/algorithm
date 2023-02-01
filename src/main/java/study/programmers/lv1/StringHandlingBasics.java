package study.programmers.lv1;

import java.util.Scanner;

public class StringHandlingBasics {

    public static void main(String[] args) {
        StringHandlingBasics T = new StringHandlingBasics();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }

    public boolean solution(String s) {
//        char tmp;
//        if (s.length() == 4 || s.length() == 6) {
//            for (int i = 0; i < s.length(); i++) {
//                tmp = s.charAt(i);
//                if (!Character.isDigit(tmp)) {
//                    return false;
//                }
//            }
//        } else {
//            return false;
//        }
//
//        return true;

        if ((s.length() == 4) || (s.length() == 6)) {
            return s.matches("(^[0-9]*$)");
        }
        return false;
    }

}