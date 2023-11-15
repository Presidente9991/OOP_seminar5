

class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }
    // Пополнение баланса
    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    // Уменьшение баланса
    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счёте или сумма для снятия некорректна");
        }
    }
    // Текущий баланс
    public double getAmount() {
        return balance;
    }
}
