package day10.exception;

public class LoginUser {

    //필드
    private String account;     // 가입시 계정명
    private String password;    // 가입시 비밀번호

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL
    }

    // 로그인 검증 로직
    public LoginStatus loginValidate(String inputAccount, String inputPassword) throws Exception {

        // 아이디가 일치하는가?
        if (!inputAccount.equals(account)) {
            throw new InvalidLoginInputException("계정이 일치하지 않습니다.");
//            System.out.println("계정이 일치하지 않습니다.");
//            return LoginStatus.ID_FAIL;
        }

        // 비밀번호가 일치하는가?
        if (!inputPassword.equals(password)) {
            throw new InvalidLoginInputException("비밀번호가 일치하지 않습니다.");
//            System.out.println("비밀번호가 일치하지 않습니다.");
//            return LoginStatus.PW_FAIL;
        }

        System.out.println("로그인이 성공했습니다.");
        return LoginStatus.SUCCESS;
    }

}
