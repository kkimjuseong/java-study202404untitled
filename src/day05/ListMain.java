package day05;

public class ListMain {

    public static void main(String[] args) {

        StringList foods = new StringList();
        StringList userNames = new StringList();


        // 배열 내부 데이터 수 확인
        System.out.println(foods.size());

        // 배열에 대이터 추가
        foods.push("짬뽕");
        foods.push("치킨");
        foods.push("탕수육");

        userNames.push("박영희");

        // 자료 삭제
        foods.remove("치킨");

        // 자료 중간 삽입
        userNames.push("김철수");
        userNames.push("박영희");

        userNames.insert(1,"뽀로로");
        foods.insert(1,"마라탕");

        // 배열 데이터 수정
        foods.set(0, "김치볶음밥"); // 0번 인덱스가 수정 되어야 함.
        userNames.set(1, "대길이"); // 1번 인덱스가 수정 되어야 함.

        // 배열 데이터 전체 삭제
        foods.clear(); // foods배열 내부가 전체 삭제되고 size가 0이 되어야 함

        // 배열 데이터가 한개라도 있는지 확인
        boolean flag = foods.isEmpty(); // 배열이 비어 있으면 true, 아니면 false


        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());
        System.out.println("foodsFlag: " + flag);



        // 초기 배열에 생성자에 전달한 데이터들이 들어있어야 함.
        StringList hobbies = new StringList("축구,", "영화감상", "음악감상");
        System.out.println("hobbies = " + hobbies.toString());

        hobbies.push("멍때리기");
        // [축구, 영화감상, 음악감상]
        System.out.println("hobbies = " + hobbies.toString());


    }
}
