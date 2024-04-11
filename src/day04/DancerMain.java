package day04;

// 실행용 클래스 : 객체를 생성해서 객체의 기능을 실행시키는 곳
// -> main이 필요
public class DancerMain {

    public static void main(String[] args) {

        // 설계도 (클래스)를 통해 객체를 찍어냄(생성)
        Dancer Kim = new Dancer();  // kim은 dancer타입

        Kim.dancerName = "김뽀또";
        Kim.crewName = "치즈치즈";
        Kim.genre = "스트릿";
        Kim.danceLevel = 1;

        // 객체의 속성을 부여
        Kim.introduce();
        Kim.dance();

        //두번째 댄서
        Dancer park = new Dancer();

        park.dancerName = "박격포";
        park.crewName = "전쟁이야";
        park.genre = "코레오";
        park.danceLevel = 2;

//        park.introduce();
        park.dance();

        Dancer hong = new Dancer();
        hong.dance();

        Dancer choi = new Dancer("최폭풍");
        choi.dance();

        Dancer nanana = new Dancer("냐냐냥", "시골크루");
        nanana.introduce();

        Dancer rock = new Dancer("메로롱","폭식맨","락킹");
        rock.introduce();
    }
}
