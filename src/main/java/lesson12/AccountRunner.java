package lesson12;

public class AccountRunner {

    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println("текущий баланс"  + account.getBalance());
        try {
            int amount = 500;
            account.withdraw(amount);

        } catch (NottEboughMoneyException exception){
            System.out.println("Снятие невозможно, балансу" + exception.getBalance());
        }
        System.out.println("текущий баланс"  + account.getBalance());
    }
}
