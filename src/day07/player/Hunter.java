package day07.player;

// 하위 클래스(sub class)
// : 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스.
public class Hunter extends Player {

    int concentration; // 집중력

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.concentration = 10;
    }

    // 스킬
    public void multipleArrow(){

    }

    public void showStatus(){
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }

}
