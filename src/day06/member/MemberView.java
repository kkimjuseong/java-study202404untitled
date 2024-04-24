package day06.member;

import Util.SimpleInput;

// 역학 : 회원 데이터 관리를 위해 입력 출력을 담당 즉 보조역할
public class MemberView {

    // 객체의 협력
    MemberRepository mr;
    SimpleInput si;
//    boolean isMemberRegistered; // 회원 등록 여부를 추적하는 변수

    // 생성자
    MemberView() {
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
//        this.isMemberRegistered = false;
    }

    void showMembers() {
        System.out.printf("========= 현재 회원 목록 (총 %d명) ==========\n", mr.members.size());
        for (Member m : mr.members.getMembers()) {
            System.out.println(m);
        }
    }


    // 회원정보 생성을 위해 입력을 처리
    void inputNewMember() {
        System.out.printf("# 회원정보 등록을 시작합니다!\n");
        String email = null;    // 변수의 사용범위 while문 안에서 email을 정의하면 while문에서만 사용 가능하기때문에 밖에서 정의
        while (true) {
            email = si.input("- 이메일: ");
            if (!mr.inDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일 입니다.");
        }

        String name = si.input("- 이름: ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별: ");
//        int age = Integer.parseInt(si.input("- 나이: "));

        int age = 0;
        while (true){
            try {
                age = Integer.parseInt(si.input("- 나이: "));
                break;
            } catch (NumberFormatException e) {
                System.out.println("나이를 숫자로 입력하세요!");
            }
        }

        if(gender.equals("남성")){
            gender = MemberConstants.MALE;
        } else if (gender.equals("여성")) {
            gender = MemberConstants.FEMALE;
        }

        // 입력데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);


        // 위임 - 관심사의 분리
        mr.addNewMember(newMember);

        // 회원 등록 여부를 true로 설정
//        isMemberRegistered = true;

        System.out.println("회원 가입 성공!!");
    }

    // 회원이 등록 되어있는지 확인


    // 사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");

        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료");
        System.out.println("===================================");

        String menuNember = si.input(" - 메뉴 번호: ");
        return menuNember;
    }

    // 프로그램 종료를 판단하는 입출력
    boolean exitProgram() {
        String exit = si.input("- 프로그램을 종료합니까? [y/n]");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다!");
            return true;
        } else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }

    // 개별회원 정보 조회하기.
    void showIndividualMember() {
        System.out.printf("조회를 시작합니다!\n");
        String targetEmail = si.input("# 이메일: ");
        Member foundMember = mr.findMemberByEmail(targetEmail);

        // 회원 정보가 발견되었는지 확인합니다.
        if (foundMember != null) {
            // 발견된 회원 정보를 출력합니다.
            System.out.println("=========== 조회결과 ===========");
            System.out.println(foundMember);
        } else {
            // 해당 이메일의 회원이 없을 경우 메시지를 출력합니다.
            System.out.println("해당 이메일의 회원이 없습니다.");
        }
    }

    void modify() {
        String choice = null;       // 코드의 사용범위로 if 문의 지역변수가 아닌 함수 전역변수로 설정
        String targetEmail = si.input("수정할 대상의 이메일을 입력하세요,");
        // 입력된 이메일을 사용하여 회원을 찾습니다.
        Member foundMember = mr.findMemberByEmail(targetEmail);

        if (foundMember != null) {
            // 수정할 필드 선택
            System.out.println("수정할 항목을 선택하세요:");
            System.out.println("1. 이름 수정");
            System.out.println("2. 비밀번호 수정");
            System.out.println("3. 나이 수정");
            System.out.println("4. 성별 수정");

            choice = si.input("선택: ");


            switch (choice) {
                case "1":
                    // 이름 수정
                    String newName = si.input("새 이름을 입력하세요: ");
                    foundMember.memberName = newName;
                    break;
                case "2":
                    // 비밀번호 수정
                    String newPassword = si.input("새 비밀번호를 입력하세요: ");
                    foundMember.password = newPassword;
                    break;
                case "3":
                    // 나이 수정
                    int newAge = Integer.parseInt(si.input("새 나이를 입력하세요: "));
                    foundMember.age = newAge;
                    break;
                case "4":
                    // 성별 수정
                    String newGender = si.input("새 성별을 입력하세요: ");
                    foundMember.gender = newGender;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    return;
            }
            System.out.println("수정이 완료 되었습니다.");
        } else {
            System.out.println("해당 회원의 이메일이 없습니다.");
        }
    }

//    void deleteMember() {
//        // 삭제할 회원의 이메일을 입력받습니다.
//        String targetEmail = si.input("삭제할 회원의 이메일을 입력하세요: ");
//
//        // 입력된 이메일을 사용하여 회원을 찾습니다.
//        Member foundMember = mr.findMemberByEmail(targetEmail);
//
//        // 회원 정보가 발견되었는지 확인합니다.
//        if (foundMember != null) {
//            // 사용자에게 회원 삭제 여부를 확인합니다.
//            String confirmation = si.input("해당 회원을 정말로 삭제하시겠습니까? [y/n]: ");
//
//            // 사용자가 삭제를 확실히 결정한 경우
//            if (confirmation.equalsIgnoreCase("y")) {
//                // 회원을 배열에서 삭제하는 로직을 실행합니다.
//                mr.deleteMemberByEmail(targetEmail);
//                System.out.println("회원 정보가 성공적으로 삭제되었습니다.");
//            } else {
//                System.out.println("회원 삭제를 취소합니다.");
//            }
//        } else {
//            // 해당 이메일의 회원이 없을 경우 메시지를 출력합니다.
//            System.out.println("해당 이메일의 회원이 없습니다.");
//        }
//    }

    public void deleteMember() {
        String inputEmail = si.input("# 삭제하실 회원의 이메일을 입력하세요.\n>> ");

        // 이메일이 일치하는 회원이 있는지 조회
        Member foundMember = mr.findMemberByEmail(inputEmail);

        if (foundMember != null) {
            // 삭제 진행
            // 패스워드 검사
            String inputPw = si.input("# 비밀번호를 입력: ");
            if (inputPw.equals(foundMember.password)) {
                mr.removeMember(inputEmail);
                System.out.printf("# %s님의 회원정보가 삭제되었습니다.\n", foundMember.memberName);
            } else {
                System.out.println("\n# 비밀번호가 일치하지 않습니다. 탈퇴를 취소합니다.");
            }
        } else {
            System.out.println("\n# 해당 회원은 존재하지 않습니다.");
        }

    }

    // 회원 복구에 관련한 입출력 처리
    public void restoreMember() {
        String inputEmail = si.input("# 복구하실 회원의 이메일을 입력하세요.\n>> ");

        // 이메일이 일치하는 회원이 복구리스트에 있는지 조회
        Member foundMember = mr.findRestoreMemberByEmail(inputEmail);

        if (foundMember != null) {
            // 패스워드 검사
            String inputPw = si.input("# 비밀번호를 입력: ");
            if (inputPw.equals(foundMember.password)) {
                mr.restore(inputEmail);
                System.out.printf("# %s님의 회원정보가 복구되었습니다.\n", foundMember.memberName);
            } else {
                System.out.println("\n# 비밀번호가 일치하지 않습니다. 복구를 취소합니다.");
            }
        } else {
            System.out.println("\n# 해당 회원은 복구대상이 아닙니다.");
        }

    }

    public void load() {
        mr.loadFile();
    }
}

