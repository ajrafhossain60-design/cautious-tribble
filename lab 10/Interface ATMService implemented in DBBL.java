interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

class DBBL implements ATMService {
    private double balance;

    DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        DBBL account = new DBBL(10000);
        account.checkBalance();
        account.deposit(2000);
        account.withdraw(5000);
        account.checkBalance();
    }
}
