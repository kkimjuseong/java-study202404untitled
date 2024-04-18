package day07.player;

// 하위 클래스(sub class)
// : 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스.
public class Warrior extends Player {

    // field
    int rege;        // 분노게이지

    public Warrior(String nickname) {
        super(nickname);
        this.rege = 100;
    }

    // 스킬
    public void dash(){
        System.out.println("DASH 스킬을 사용합니다.");
    }

    @Override // 오버라이딩 룰을 지켰는지 검증해주는 자바 툴
    // 오버라이딩 : 부모가 물려준 메서드를 고쳐 쓰는 것.
    // 규칙 : 부모가 물려준 형태를 유지할 것. (파라미터, 리턴타입, 이름)
    // 규칙 : 접근제한자는 부모보다 more public 할 것!
    public void showStatus(){
        super.showStatus();
        System.out.println("# Rege: " + this.rege);
    }


}
