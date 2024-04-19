package day07.player;

// 하위 클래스(sub class)
// : 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스.
public class Mage extends Player {

    // 마법사..!!
    int mp;   // 마나

    public Mage(String nickname) {
        super(nickname);
        this.mp = 100;
    }

    // 스킬
    public void thunderbolt(Player... target) {
        System.out.printf("# %s님 썬더볼트 시전!!!\n", this.nickname);

        // 대상에게 피해를 줌
        for (Player player : target) {
            if(player == this){
                // 자기 자신은 피해를 입지 않음
//                System.out.println("피해를 입지 않았습니다.");
//                continue;
            } else {
                int damage = (int)(Math.random()*6 + 10);

                // 대상에게 피해 주기
                player.hp -= damage;

                // 피해 정보 출력
                System.out.println(player.nickname + " 님이 " + damage + " 의 피해를 입으셨습니다. (남은체력 : " + player.hp + ")");
            }
        }
    }


    public void showStatus(){
        super.showStatus();
        System.out.println("# mp: " + this.mp);
    }


}
