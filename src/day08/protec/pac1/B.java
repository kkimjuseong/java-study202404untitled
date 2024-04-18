package day08.protec.pac1;

public class B {

    void test() {

        A a = new A(); // public 생성자
        new A(10);      // protected 생성자
        new A(3.3);     // default 생성자

        // 같은 패키지에서는 protected 와 default 에 차이가 없다
        a.f1 = 10; a.f2 = 30;
        a.m1(); a.m2();


    }



}
