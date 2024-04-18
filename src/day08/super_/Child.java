package day08.super_;

public class Child extends Parent{

//    int a;
//    double b;
    boolean c;

    Child(){
        this(100);
        System.out.println("Child 클래스 생성자 호출!");
        this.c = true;
    }

    Child(int x){
        super();
        System.out.println("Child 클래스의 2번째 생성자 호출!");
    }

    void childMethod(){
        System.out.println("parent a : " + this.a);
        System.out.println("parent b : " + this.b);
        System.out.println("parent c : " + this.c);
    }
}
