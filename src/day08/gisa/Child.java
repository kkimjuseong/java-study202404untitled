package day08.gisa;

public class Child extends Parent{

    // new Child(); 일때 출력 순서
    // P(String) -> P() -> C(String) -> C()

    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call!");
    }

    public Child(String name) {
        super();
        this.name = name;
        System.out.println("Child(String) call!");
    }

    void aaa(){
        System.out.println("aaa");
        bbb();
    }
    void bbb(){
        System.out.println("bbb");
        ccc();
    }
    void ccc(){
        System.out.println("ccc");
    }
}
