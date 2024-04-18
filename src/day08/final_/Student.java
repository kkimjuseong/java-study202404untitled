package day08.final_;

public class Student {

    String name;        // 이름
    final String ssn;         // 주민번호
    static final String nation = "대한민국";     // 국적



    Student(final String ssn) {
        this.ssn = ssn;
    }


}
