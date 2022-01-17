package ex11;

class 애완동물 {
    void sound() {
    }
}

class 강아지 extends 애완동물 {
    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {
    void sound() {
        System.out.println("야옹");
    }
}

public class ExtendsEx03 {

    static void start(애완동물 u1) {
        u1.sound();
    }

    public static void main(String[] args) {
        고양이 cat = new 고양이();
        강아지 dog = new 강아지();
        start(cat);
        start(dog);
    }
