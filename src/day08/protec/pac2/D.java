package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {

    D() {
        // protected 는 상속받을 수 있음
        // 그러나 default 는 불가능하다.
        super(100);

        super.f1 = 100;       // protected 라 가능
//        f2 = 200;       // default 라 불가능

        m1();       // protected
//        m2();       // default

    }

    void test() {
        // 상속을 통해서만 접근을 허용해줌
        A a = new A();
//        f1 = 10; f2 = 30;
//        m1(); m2();
    }


}
