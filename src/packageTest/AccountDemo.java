package packageTest;

public class AccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("XYZ", "12345", 5000);
        System.out.println(account);

        account.deposit(200);
        System.out.println(account.getBalance());

        account.withdraw(100);
        System.out.println(account.getBalance());
        System.out.println(account);

        account.withdraw(5200);
        System.out.println(account);
    }
}
