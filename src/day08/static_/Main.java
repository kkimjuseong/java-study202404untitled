package day08.static_;

import Util.SimpleInput;
import static Util.SimpleInput.input;
import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

        // static 은 객체생성 없이 접근이 가능하다
        // c1.y =10; 이는 c1이 생성이 안되 불가능하지만
        // Count.x = 20; 은 가능함

        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();
        c1.m2();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

        Count.x = 99;
        Count.x = 50;

        System.out.println("c1.x = " + Count.x);
        System.out.println("c2.x = " + Count.x);
        System.out.println("====================");
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);


        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

//        Calculator.calcArea(5);

        redCal.paint("빨강");
        blueCal.paint("파랑");

        String name = input("이름 : >> ");
        double rn = random();

        System.out.println();

        Count.m1();
    }
}
