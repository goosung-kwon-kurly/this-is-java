package temp.src.ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        //예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        //출금하기
        try {
            int amount = 30000;
            System.out.println("출금액: " + amount);
            account.withdraw(amount);
            System.out.println("잔액: " + account.getBalance());
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
