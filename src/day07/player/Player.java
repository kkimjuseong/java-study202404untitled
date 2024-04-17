package day07.player;

// 상위 클래스(super class)
// : 공통 속성(필드: field)과 기능(method)을 가진 부모 클래스이다.
public class Player {

    // field
    String nickname; // 이름
    int level;       // 렙
    int hp;


    // 현재 캐릭터 정보를 출력
    public void showStatus(){
        System.out.println("\n ========= Character's Info =========");
        System.out.println("# Nickname: " + this.nickname);
        System.out.println("# Level: " + this.level);
        System.out.println("# HP: " + this.hp);
    }


}
