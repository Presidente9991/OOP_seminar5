/**
 * Протестировать классы Account, CreditAccount из ДЗ #1.
 * 1. Создать Account. Пополнить его на X рублей. Проверить, что на счету X рублей.
 * 2. Создать Account. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X-Y рублей.
 * 3. Создать CreditAccount. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X - 1.01*Y рублей.
 * 4. ** Протестировать DepositAccount. Тест-кейсы придумать самостоятельно.

 * Примерный код:
 * Account testObject = new Account();
 * testObject.put(10);
 * Assertions.assertEquals(10, testObject.getAmount());
 *
 */


class Main {
    public static void main(String[] args) {
        // 1. Создать Account. Пополнить его на X рублей. Проверить, что на счету X рублей.
        Account account = new Account();
        account.put(500);
        Assertions.assertEquals(500, account.getAmount());

        // 2. Создать Account. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X-Y рублей
        Account account2 = new Account();
        account2.put(500);
        account2.take(100);
        Assertions.assertEquals(400, account2.getAmount());

        // 3. Создать CreditAccount. Пополнить его на X рублей. Снять с него Y рублей.
        // Проверить, что на счету X - 1.01*Y рублей.
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.put(100);
        creditAccount.take(50);
        Assertions.assertEquals(49.5, creditAccount.getAmount());

        // 4. Протестировать DepositAccount
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.put(1000);
        depositAccount.take(500);

        depositAccount.take(50);
        Assertions.assertEquals(51, depositAccount.getAmount());

        depositAccount.take(25);
        Assertions.assertEquals(26, depositAccount.getAmount());
    }
}
