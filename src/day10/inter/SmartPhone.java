package day10.inter;

public interface SmartPhone {

    // 인터페이스는 기본적으로 추상화 상태이기 때문에 추상화 키워드를 사용하지 않아도 됨.
    // 인터페이스는 처음 설계부터 객체를 만들지 않을 것을 가정했으므로 생성자 및 필드를 선언 불가 but 상수는가능

    //    public static final int age = 10; // 가능
    int age = 20;  // 원래 int 뒤에 위 처럼 psf 가 생략되어있음
    //    int age; // 불가능



    // 스펙 보여주기 기능
    void information();

    // 충전 기능
    void charge();

    // 카메라 기능
    void camera();
}
