package day08.enum_.quiz01;

/*
클래스 TeamMember 생성

속성:
name (팀원 이름, 문자열)
role (팀원의 역할, TeamRole)
메소드:
생성자: name과 role을 매개변수로 받아 초기화합니다.
assignTask(): 팀원의 역할에 따라 적절한 작업을 출력하는 메소드. 예를 들어, DEVELOPER에게는 "Developing features"를 할당합니다.

 */
public class TeamMember {

    // TeamMember class: 팀원의 이름과 역할을 관리
    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        switch (role) {
            case LEADER:
                System.out.println(name + " is assigned to " + role.getDescription());
                break;
            case TESTER:
                System.out.println(name + " is assigned to " + role.getDescription());
                break;
            case DESIGNER:
                System.out.println(name + " is assigned to " + role.getDescription());
                break;
            case DEVELOPER:
                System.out.println(name + " is assigned to " + role.getDescription());
                break;
        }
    }
}
