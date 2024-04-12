package day05;

// 다른 클래스에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기 위해
//import day05.juice.Apple;
//import day05.juice.Banana;
//import day05.juice.Peach;
// * 쓰면 위 juice 에있는 모든 내용을 가져옴 개꿀
import day05.juice.*;

public class PackageMain {

    public static void main(String[] args) {

        // 패키지 포함 풀 네임을 적어줘야함
        day05.fruit.Apple a1 = new day05.fruit.Apple();
        day05.juice.Apple a2 = new day05.juice.Apple();
        new Banana();
        new Peach();

        java.util.Scanner sc = new java.util.Scanner(System.in);

    }

}
