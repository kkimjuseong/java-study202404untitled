package day07.encap.practice;

/**
 * 학생 정보 시스템
 *
 * 학생의 이름(name), 학번(studentId), 학과(department) 정보를 관리하는 Student 클래스를 만드세요.
 * 모든 정보 필드는 private으로 선언하고, 각 필드의 getter와 setter 메소드를 public으로 만드세요.
 * setter 메소드에서는 유효하지 않은 입력(예: null 값 또는 빈 문자열)에 대한 검증 로직을 포함하세요.
 */

public class Student {

    private String name;
    private String studentId;
    private String department;

    public Student(){

    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 null이거나 빈 문자열일 수 없습니다.");
        }
        this.name = name;
    }

    public void setStudentId(String Id) {
        if (studentId == null || studentId.isEmpty()) {
            throw new IllegalArgumentException("학번은 null이거나 빈 문자열일 수 없습니다.");
        }
        this.studentId = Id;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            throw new IllegalArgumentException("학과는 null이거나 빈 문자열일 수 없습니다.");
        }
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

}
