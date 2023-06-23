package study.programmers.lv1.브루트포스;

public class _001약수의합 {

    public static void main(String[] args) {
        _001약수의합 t = new _001약수의합();
        int n = 12;
        System.out.print(t.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer + n;
    }

}