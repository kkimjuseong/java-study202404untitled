package day07.player;

// 하위 클래스(sub class)
// : 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스.
public class Mage extends Player {

    // 마법사..!!
    int mp;   // 마나

    public Mage(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.mp = 100;
    }

    // 스킬
    public void thunderbolt(Mage... target) {

    }

    public void showStatus(){
        super.showStatus();
        System.out.println("# mp: " + this.mp);
    }


}
