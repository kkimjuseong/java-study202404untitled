package day10.abs;

public class Cat extends Pet {

    public Cat(String name, int age, String kind) {
        super(name, age, kind);
    }

    public void eat() {
        System.out.println("고양이는 생선을 먹어요~~");
    }
    public void sleep() {
        System.out.println("고양이는 낮잠을 많이 자요~");
    }
}
