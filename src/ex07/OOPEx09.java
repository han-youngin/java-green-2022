package ex07;

class Person3 {
    String name;
    int height;
    int weight;

    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어진다.
    // 클래스명(){}
    // 디폴트 생성자= 객체의 초기화를 위해 필요!!
    // 생성자는 보이드 없고(리턴이 없으므로) 클래스 이름과 동일해야한다.

    // 디폴트 생성자(constructor)
    Person3(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class OOPEx09 {
    public static void main(String[] args) {
        Person2 s1 = new Person2("홍길동", 170, 70);
        Person2 s2 = new Person2("임꺽정", 150, 60);
    }
}
