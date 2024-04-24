package day06.member;

import day12.io.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

// 역학: 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    // const members - [{} {} {}]
//    static Member[] members;
//    static Member[] restoreList; // 삭제된 회원들이 모일 배열

    // const members = { [{} {} {}] }
    MemberList members;
    MemberList restoreList;

    // 생성자
    MemberRepository() {

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

        members.push(newMember);

        // 회원정보 텍스트 파일에 저장하기
        // 두번째 파라미터에 true 넣어주지 않으면 기존 데이터가 초기화되고 정보가 입력이 됨
        // 그래서 true 를 넣어주면 새롭게 추가만 된다.
        try (FileWriter fw = new FileWriter(FileExample.ROOT_PATH + "/hello/member.txt", true)) {

            String newMemberInfo = String.format("%s,%s,%s,%d,%s\n",
                    newMember.email, newMember.memberName, newMember.password, newMember.age, newMember.gender);

            fw.write(newMemberInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 회원정보 세이브파일 불러오기
    public void loadFile() {
        String targetPath = FileExample.ROOT_PATH + "/hello/member.txt";

        try (FileReader fr = new FileReader(targetPath)) {

            // 보조 스트림 활용
            // 텍스트를 라인 단위로 읽어드리는 보조스트림
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String s = br.readLine();

                if (s == null) break;

                String[] split = s.split(",");

                // 읽어들인 회원정보로 회원 객체 생성
                Member member = new Member(
                        split[0],
                        split[2],
                        split[1],
                        split[3],
                        Integer.parseInt(split[4])
                );

                this.members.push(member);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

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

        return members.get(targetEmail);
    }


    // 배열에서 회원정보 삭제
    public void removeMember(String inputEmail) {

        int index = members.findIndex(inputEmail);

        if (index == -1) return;

        // members배열에서 삭제 후 삭제된 member를 리턴받음
        Member removed = members.remove(index);
        restoreList.push(removed);

    }

    public Member findRestoreMemberByEmail(String inputEmail) {
        return restoreList.get(inputEmail);
    }

    public void restore(String inputEmail) {

        int index = restoreList.findIndex(inputEmail);
        Member removed = restoreList.remove(index);
        members.push(removed);
    }
}


