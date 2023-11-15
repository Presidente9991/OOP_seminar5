import java.time.LocalDate;

class DepositAccount extends Account {
    private LocalDate lastWithdrawalDate;

    public DepositAccount() {
        this.lastWithdrawalDate = LocalDate.now();
    }

    @Override
    public void take(double amount) {
        LocalDate currentDate = LocalDate.now();
        if (amount > 0 && amount <= getAmount() && currentDate.isAfter(lastWithdrawalDate.plusMonths(1))) {
            super.take(amount);
            lastWithdrawalDate = currentDate;
        } else {
            System.out.println("Недостаточно средств на счете, сумма для снятия некорректна или снятие слишком часто.");
        }
    }
}