package day08.enum_.quiz01;

/*
TeamRole 열거형 정의

팀원의 역할을 나타내는 enum을 정의합니다. 역할은 LEADER, DEVELOPER, DESIGNER, TESTER를 포함합니다.
각 역할에는 역할의 설명을 반환하는 메소드를 포함합니다.
 */
public enum TeamRole {

//     TeamRole enum: 팀원의 역할을 정의하고 각 역할에 따른 설명을 제공
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    private final String description;

    TeamRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
