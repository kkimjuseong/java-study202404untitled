package day06.member;

import java.time.LocalDate;

// 역할 : 회원 1명의 정보를 가지고 있어야 한다.
public class Member {

    int id; // 식별번호
    int age;
    String email; // email
    String memberName; // 유저이름
    String password; // 비밀번호
    String gender;  //성별
    LocalDate regDate; // 회원가입일자


    // 생성자 : 회원정보가 생성될 때 초기 데이터를 처리.
    // - 객체가 생성될 시점에 호출되는 함수로 객체의 초기화를 담당한다.
    // 시스템이 생성하는 데이터 : 회원번호, 회원가입일자
    // 사용자가 제공하는 데이터 : 이메일 , 패스워드, 이름, 성별, 나이
    public Member(String email, String password, String memberName, String gender, int age) {
        this.id = 1;
        this.regDate = LocalDate.now();  // 현재 시간을 읽어서 자동으로 넣어줌.

        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    // toString : 객체의 정보를 출력할 수 있음.
    public String toString() {
        return String.format("# 이름: %s,# 이메일: %s,# 나이: %d세,# 성별: %s,# 가입일: %s"
                , this.memberName, this.email, this.age, this.gender, this.regDate);

    }
}
