package day06.member;

// 역할 : 사용자의 메뉴 입력을 분기하는 역할
public class MemberController {

    MemberView mv;

    MemberController() {
        this.mv = new MemberView();
    }

    // 메뉴 입력 분기에 따라 할 일을 나눠주는 기능
    void run() {

        while (true) {
            String menuNum = mv.showProgramMenu();

            switch (menuNum) {
                case "1":
                    System.out.printf("# 회원정보 등록을 시작합니다!\n");
                    mv.inputNewMember();
                    break;
                case "2":
                    mv.showIndividualMember();
                    break;
                case "3":
                    mv.showMembers();
                    break;
                case "4":
                    mv.modify();
                    break;
                case "5":
                    break;
                case "6":
                    boolean flag = mv.exitProgram();
                    if (flag) return;


            }
        }
    }
}
