package day08.static_.college;

/*
요구사항
클래스 Department 생성
속성:
departmentName (학과 이름, 문자열, 인스턴스 변수)
studentCount (학과별 학생 수, 정수형, 인스턴스 변수)
totalStudents (전체 학생 수, 정수형, static 변수)
메소드:
생성자: departmentName과 학과별 초기 학생 수를 매개변수로 받아 초기화하며, totalStudents를 적절히 업데이트합니다.
addStudent(int number): 주어진 수만큼 학과 학생 수를 증가시키고 totalStudents도 적절히 업데이트합니다.
getStudentCount(): 현재 학과의 학생 수를 반환합니다.
getTotalStudents(): 전체 학생 수를 반환하는 static 메소드입니다.
 */

public class Department {
    private String departmentName;
    private int studentCount;
    private static int totalStudents = 0;

    // 생성자: 학과 이름과 학과별 초기 학생 수를 초기화하고, totalStudents를 업데이트
    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        // 전체 학생 수를 업데이트
        totalStudents += studentCount;
    }

    // 주어진 수만큼 학과 학생 수를 증가시키고, 전체 학생 수를 업데이트
    public void addStudent(int number) {
        this.studentCount += number;
        totalStudents += number;
    }

    // 현재 학과의 학생 수를 반환
    public int getStudentCount() {
        return studentCount;
    }

    // 전체 학생 수를 반환하는 static 메소드
    public static int getTotalStudents() {
        return totalStudents;
    }
}
