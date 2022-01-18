package lesson12;

public class NottEboughMoneyException extends RuntimeException {

    private  double balance;

    public NottEboughMoneyException(double balance) {
        this.balance = balance;
    }

    public NottEboughMoneyException(String message, double balance) {
        super(message);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
