package day04;

// 강아지 설계
public class Dog {
    // 필드 (field) : 객체의 속성
    String dogName;     // 이름
    int age;            // 나이
    boolean injection;  // 예방접종

    // 메서드 객체의 기능
    void petInfo() {
        System.out.printf("우리집 강아지는 %s이고, %d살 이에요!\n" ,dogName,age);
        if(injection){
            System.out.println("예방접종을 했어요.");
        } else {
            System.out.println("예방접종을 안 했어요.");
        }
    }

    void inject() {
        System.out.printf("%s 강아지에게 주사를 맞춰요!\n", dogName);
        injection = true;
    }

    Dog(){
        System.out.println("1번 생성자 호출");
    }

    // 생성자는 무조건 클래스 이름과 똑같이 만들어야 함!
    Dog(String dName){
        System.out.println("2번 생성자 호출");
        dogName = dName;
        age = 1;
    }
}
