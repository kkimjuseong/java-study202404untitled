package day06.member;

public class Test {

    public static void main(String[] args) {

        Member[] arr = new Member[5];

        Member m1 = new Member("abc@abcd.com", "1234", "김철수", "남성", 30);
        Member m2 = new Member("abcd@abcd.com", "1234", "김현수", "여성", 28);

        arr[0]= m1;
        arr[1]= m2;
        arr[2] = new Member("ad", "d", "b", "남", 24);


        System.out.println("m1 = " + m1.toString());
        System.out.println("m2 = " + m2.toString());

        Member[] members = {m1, m2};
    }
}
