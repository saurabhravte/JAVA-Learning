class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void printName(){
        System.out.println("Name: " + name);
    }

    void showSummary(){
        printName();
        System.out.println("Balance: Rs. " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    void showSummary(){
        super.showSummary();
        System.out.println("Interest rate: " + interestRate);
    }
}

public class BankingApplication {
    static void main() {
        BankAccount bankAccount = new SavingsAccount("Bablu", 5000, 1.5);
        bankAccount.showSummary();
    }
}
