package day08.enum_.quiz01;
/*
구현할 사항
TeamRole 열거형과 TeamMember 클래스를 구현합니다.
Main 클래스에서 몇 명의 팀원을 생성하고, 각 팀원에게 작업을 할당하는 시뮬레이션을 실행합니다.
 */

public class Main {
    public static void main(String[] args) {
        TeamMember alice = new TeamMember("Alice", TeamRole.DEVELOPER);
        TeamMember bob = new TeamMember("Bob", TeamRole.DESIGNER);
        TeamMember charlie = new TeamMember("Charlie", TeamRole.LEADER);
        TeamMember david = new TeamMember("David", TeamRole.TESTER);

        alice.assignTask(); // Alice is assigned to Develops the software.
        bob.assignTask();   // Bob is assigned Designs the user interface.
        charlie.assignTask(); // Charlie is assigned Manages the team and coordinates.
        david.assignTask();  // David is assigned Tests the software for bugs.
    }
}
