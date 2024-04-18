package day08.final_;

class Child extends Parent{

    @Override
    void sing() {
        System.out.println("비비크림 빠빠빠");
    }

    @Override
    void dance() {
        System.out.println("춤을 핑퐁삥");
    }

}

// class 앞에 final 쓰면 상속 불가능..!
public class Parent {

    // void 앞에 final 붙이면 오버라이딩 불가능!!
    void sing(){
        System.out.println("노래를 라랄랄!");
    }

    // void 앞에 final 붙이면 오버라이딩 불가능!!
    void dance(){
        System.out.println("댄스를 촤차차!");
    }
}
