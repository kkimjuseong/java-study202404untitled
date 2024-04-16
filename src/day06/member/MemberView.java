package day06.member;

// 역학 : 회원 데이터 관리를 위해 입력 출력을 담당 즉 보조역할
public class MemberView {

    // 객체의 협력
    MemberRepository mr;

    // 생성자
    MemberView(){
        this.mr = new MemberRepository();
    }

    void showMember() {
        System.out.printf("============= 현재 회원 목록 (총 %d명) ===============\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }
    }
}
