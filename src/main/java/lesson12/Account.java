package lesson12;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    public void withdraw(double amount) throws NottEboughMoneyException {
        if (balance < amount) {
            throw new NottEboughMoneyException("баланс меньше суммы", this.balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
