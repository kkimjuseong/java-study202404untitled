package day06.member;

// 역학: 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    static Member[] members;

    // 생성자
    MemberRepository() {
        this.members = new Member[0];
    }

    // 매서드


    /**
     * 생성된 회원정보를 회원 배열에 끝에 추가하는 기능
     *
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewMember(Member newMember) {


        // 배열의 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[members.length] = newMember;
        members = temp;
    }


    /**
     * 이메일이 중복을 확인하는 기능
     *
     * @param targetEmail - 검사할 사용자의 입력 이메일 값
     * @return - 이메일이 이미 존재한다면 true
     * 존재하지 않는 이메일이면 false
     * @author - 코딩킹
     * @since - 2024.04.16
     */

    boolean inDuplicateEmail(String targetEmail) {
        for (Member m : members) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }


//    /**
//     * 사용자가 입력한 ID에 해당하는 회원 정보를 반환합니다.
//     *
//     * @param targetId - 조회할 회원의 ID
//     * @return - 해당 ID의 회원 객체를 반환하고, ID에 해당하는 회원이 없을 경우 null 반환
//     */
//    Member findMemberById(int targetId) {
//        for (Member m : members) {
//            if (m.id == targetId) {
//                return m;
//            }
//        }
//        return null; // 해당 아이디가 없을경우 null표시
//    }

    /**
     * 사용자가 입력한 이메일에 해당하는 회원 정보를 반환합니다.
     *
     * @param targetEmail - 조회할 회원의 이메일
     * @return - 해당 이메일의 회원 객체를 반환하고, 이메일에 해당하는 회원이 없을 경우 null 반환
     */
    Member findMemberByEmail(String targetEmail) {
        for (Member m : members) {
            if (m.email.equals(targetEmail)) {
                return m;
            }
        }
        return null; // 해당 이메일의 회원이 없을 경우 null 반환
    }
}


