package day07.encap.practice;

/**
 * 비밀번호 관리 클래스
 *
 * 사용자의 비밀번호를 관리하는 PasswordManager 클래스를 작성하세요.
 * 비밀번호(password) 필드는 private으로 선언하고, 비밀번호를 설정하고 변경할 수 있는 메소드를 public으로 만드세요.
 * 비밀번호 변경 시 현재 비밀번호를 입력받아야만 변경 가능하도록 구현하세요.
 */
public class PasswordManager {

    private String password;

    public PasswordManager(String oldPassword) {
        this.password = oldPassword;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        // 현재 비밀번호가 oldPassword와 일치하는지 확인
        if (password.equals(oldPassword)) {
            // 일치하면 비밀번호를 newPassword로 변경
            password = newPassword;
            return true;
        } else {
            // 일치하지 않으면 false 반환
            return false;
        }

    }
}
