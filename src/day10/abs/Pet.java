package day10.abs;

// 클래스가 abstract 가 아니면 메서드에 넣을 수 없음.
public abstract class Pet {
    private String name;
    private int age;
    String kind;

    // 자식에 의해 생성자가 생성되므로
    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }


    // 추상 메서드 : 자식들에게 이름만 제공해줌
    // abstract 를 붙이면 됨.
    // 밥 , 잠 기능은 필수 기능이라 없으면 객체가 불안정해서 강요할 필요가 있으므로 추상화시킴
    public abstract void eat();

    // 추상 메서드는 본문이 없는 껍데기 역할, 자식들에게 이름을 통일시키기 위한 장치로만 사용
    // 추상 메서드는 추상 클래스 안에서만 선언 가능
    // 다만 추상 클래스 내부에는 추상 메서드 이외에 모든 메서드 구현 가능
    public abstract void sleep();

    // 산책기능은 필요한 객체가 필요에 따라 오버라이딩 하는것
    // 모두에게 강요할 필요가 없기때문에 추상화하지 않아도 됨.
    public void walk(){}

}
