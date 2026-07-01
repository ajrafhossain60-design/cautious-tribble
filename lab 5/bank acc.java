class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Sonali Bank";

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount.showBankName();
        BankAccount acc1 = new BankAccount("ACC1001", "Ajraf", 5000);
        BankAccount acc2 = new BankAccount("ACC1002", "Rahim", 7500);
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}
