package ex06;

public class WhileEx05 {
    public static void main(String[] args) {
        int n = 1;

        // 변수 n을 이용해서 1부터 10까지 출력하시오.
        // 출력이 끝나면 break문으로 빠져나오시오.

        while (true) {
            System.out.println(n);
            n = n + 1;

            if (n == 11) {
                break;
            }
        }
    }
}
