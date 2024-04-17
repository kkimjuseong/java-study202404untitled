package day07.modi.pac1;

import day07.modi.pac2.C;

// class 에는 public 과 default 만 사용가능하다.
public class B {

    public int z1;
    int z2;
    private int z3;

    void test () {

        A a1 = new A(50);   // public 이라 가능
        A a2 = new A(5.55); // default
//        new A(true);           // private

        a1.f1 = 20;     // public
        a1.f2 = 50;     // default
//        a1.f3 = 500;    // private

        a1.m1();        // public
        a1.m2();        // default
//        a1.m3();        // private

        // 클래스가 달라 퍼블릭만
        C c = new C();
        c.y1 = 10;
//        c.y2 = 20;
//        c.y3 = 30;



    }
}
