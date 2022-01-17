package exam;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자를 입력하세요");
        int n1 = sc.nextInt();
        System.out.println("마지막 숫자를 입력하세요");
        int n2 = sc.nextInt();

        System.out.println();

        for (int a = n1; a <= n2; a++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(a + "*" + i + "=" + (a * i));
            }
            System.out.println();
        }
    }
}
