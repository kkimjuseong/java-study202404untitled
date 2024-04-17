package day07.encap.practice;

/**
 * 은행 계좌 클래스 만들기
 * 은행 계좌를 관리하는 BankAccount 클래스를 만드세요.
 * 계좌 잔액(balance), 계좌 번호(accountNumber), 계좌 주인의 이름(accountHolder) 필드를 private로 선언하세요.
 * 잔액 조회, 입금, 출금 메소드를 public으로 만들어 외부에서 접근할 수 있게 하세요.
 * 출금 메소드는 잔액이 출금하려는 금액보다 클 때만 돈을 출금할 수 있도록 하세요.
 */
public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private long balance;

    public BankAccount(String accountNumber, String accountHolder, long balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public long getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount < 0 || amount > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
            return;
        }
        this.balance -= amount;

    }

}
