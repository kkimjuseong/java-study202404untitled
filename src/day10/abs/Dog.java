package day10.abs;

public class Dog extends Pet{

    public void eat() {
        System.out.println("강아지는 사료를 먹어요~");

    }

    @Override
    public void sleep() {
        System.out.println("강아지는 마당에서 낮잠을 자요~~");
    }

    @Override
    public void walk() {
        System.out.println("강아지는 산책을 좋아합니다.");
    }
}
