package day06.member;

// 역학: 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    static Member[] members;

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abcd@efg.com", "1234", "콩순이", "여성", 20);
        members[1] = new Member("abce@efg.com", "12345", "남수이", "남성", 26);
        members[2] = new Member("abcf@efg.com", "12346", "철수이", "남성", 25);
    }

    // 매서드

    // 회원정보 생성
    void addNewMember(Member newMember) {

        // 배열의 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[members.length] = newMember;
        members = temp;
    }
}
