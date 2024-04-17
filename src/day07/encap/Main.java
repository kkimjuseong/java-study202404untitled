package day07.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

        myCar.startStop();

        // 속도 0 ~ 200km 제한
        myCar.setSpeed(80);

        System.out.println("현재 속도 : " +myCar.getSpeed() + "km/h");
        // km가 아니라 mile 로 바꿔줄수도.

        // 변속모드
        myCar.setMode('X');
        System.out.println("현재 변속 모드: " + myCar.getMode());
    }
}
