package ex06;

public class WhileEx06 {
    public static void main(String[] args) {
        int n = 2;
        while (true) {
            System.out.println(n);
            n = n + 2; // 쌤은 if(n%2==0){sysout(n)} ==> 이렇게 하면 도는 횟수 최소화

            if (n > 10) {
                break;
            }
        }
    }
}
