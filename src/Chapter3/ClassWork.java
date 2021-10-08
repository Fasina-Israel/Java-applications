package Chapter3;

public class ClassWork {
    private int balance;
    private static String accountName;
    private int accountNumber;

    public ClassWork(int balance, String accountName, int accountNumber) {
        this.balance = balance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amountDeposited) {
        this.balance += amountDeposited;
    }

    public void withDrawal(int amountWithdrew) {
        this.balance -= amountWithdrew;
        if (this.balance - amountWithdrew < 0) {
            System.out.println("Balance is equal to " + this.balance + "your transaction cannot be processed");
        } else {
            System.out.println("your transaction of " + amountWithdrew + " is processing, your remaining balance is " + this.balance);
        }
    }
}

