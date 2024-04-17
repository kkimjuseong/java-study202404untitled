package day06.member;

import java.util.Arrays;

// 역학: 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    // const members - [{} {} {}]
//    static Member[] members;
//    static Member[] restoreList; // 삭제된 회원들이 모일 배열

    // const members = { [{} {} {}] }
    MemberList members;
    MemberList restoreList;
    MemberList ml;

    // 생성자
    MemberRepository() {
//        this.members = new Member[3];
//        members[0] = new Member("abc@def.com", "1234", "콩순이", "여성", 50);
//        members[1] = new Member("ghi@def.com", "5432", "팥돌이", "남성", 40);
//        members[2] = new Member("xyz@def.com", "7890", "팥죽이", "여성", 30);

//        restoreList = new Member[0];
//        ml = new MemberList();

        this.members = new MemberList();
        members.push(new Member("abc@def.com", "1234", "콩순이", "여성", 50));
        members.push(new Member("ghi@def.com", "5432", "팥돌이", "남성", 40));
        members.push(new Member("xyz@def.com", "7890", "팥죽이", "여성", 30));

        this.restoreList = new MemberList();

    }

    // 매서드


    /**
     * 생성된 회원정보를 회원 배열에 끝에 추가하는 기능
     *
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewMember(Member newMember) {

        // 배열의 데이터를 추가하는 로직
//        Member[] temp = new Member[members.length + 1];
//        for (int i = 0; i < members.length; i++) {
//            temp[i] = members[i];
//        }
//        temp[members.length] = newMember;
//        members = temp;

        members.push(newMember);
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
//        for (Member m : members) {
//            if (targetEmail.equals(m.email)) {
//                return true;
//            }
//        }
//        return false;
        return members.findIndex(targetEmail) != -1;
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
//        for (Member m : members) {
//            if (m.email.equals(targetEmail)) {
//                return m;
//            }
//        }
//        return null; // 해당 이메일의 회원이 없을 경우 null 반환
        return members.get(targetEmail);
    }


//    public void deleteMemberByEmail(String targetEmail) {
//        // 삭제할 회원의 인덱스를 찾습니다.
//        int indexToRemove = -1;
//        for (int i = 0; i < members.length; i++) {
//            if (members[i].email.equals(targetEmail)) {
//                indexToRemove = i;
//                break;
//            }
//        }
//
//        // 삭제할 회원을 찾았으면 배열에서 제거합니다.
//        if (indexToRemove != -1) {
//            // 새 배열을 생성하여 기존 배열의 요소를 복사합니다.
//            Member[] newMembers = new Member[members.length - 1];
//            int newIndex = 0;
//            for (int i = 0; i < members.length; i++) {
//                if (i != indexToRemove) {
//                    newMembers[newIndex++] = members[i];
//                }
//            }
//            // members 배열을 새 배열로 대체합니다.
//            members = newMembers;
//        }
//    }

//    int findIndex(String email) {
//        for (int i = 0; i < members.length; i++) {
//            if (email.equals(members[i].email)) {
//                return i;
//            }
//        }
//        return -1;

//    }

    // 배열에서 회원정보 삭제
    public void removeMember(String inputEmail) {
//        int index = findIndex(inputEmail);
//
        int index = members.findIndex(inputEmail);

        if (index == -1) return;
//        if (index == -1) return;
//
//        for (int i = index; i < members.length - 1; i++) {
//            members[i] = members[i + 1];
//        }
//
//        Member[] temp = new Member[members.length - 1];
//        for (int i = 0; i < temp.length; i++) {
//            temp[i] = members[i];
//        }
//        members = temp;
        members.remove(index);

    // members배열에서 삭제 후 삭제된 member를 리턴받음
    Member removed = members.remove(index);
        restoreList.push(removed);

        System.out.println(Arrays.toString(members.mArr));
        System.out.println(Arrays.toString(restoreList.mArr));
    }


    public Member findRestoreMember(String inputEmail) {

        return restoreList.get(inputEmail);
    }

    public void restore(String inputEmail) {

        int index = restoreList.findIndex(inputEmail);
        Member removed = restoreList.remove(index);
        members.push(removed);
    }
}


