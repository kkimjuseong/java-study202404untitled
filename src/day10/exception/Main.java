package day10.exception;

public class Main {

    public static void main(String[] args) throws Exception {

//        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);

//        int n  = te.convert("100");
//        System.out.println("n = " + n);

        LoginUser user = new LoginUser("abc1234", "1234");

        try {
            user.loginValidate("abc1234", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 로그 출력.
        }
    }

}
