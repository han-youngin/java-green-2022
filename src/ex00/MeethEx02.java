package ex00;

class Cal2 {
    // 투입구 출구 둘 다 있는 메서드
    static int add(int a1, int a2) {
        return a1 + a2;
    }

    static int minus(int a1, int a2) {
        return a1 - a2;
    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }

    static int divide(int a1, int a2) {
        return a1 / a2;
    }
}

public class MeethEx02 {
    public static void main(String[] args) {
        int r1 = Cal2.add(10, 8);
        System.out.println("r1:" + r1);
        int r2 = Cal2.minus(10, 8);
        System.out.println("r2:" + r2);
        int r3 = Cal2.multi(10, 8);
        System.out.println("r3:" + r3);
        int r4 = Cal2.divide(10, 8);
        System.out.println("r4:" + r4);
    }
}
