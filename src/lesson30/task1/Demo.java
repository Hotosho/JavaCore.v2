package lesson30.task1;

public class Demo {
    public static void main(String[] args) {
        Bank usBank = new USBank(1222, "USA", Currency.USD, 100, 1400, 4, 444334);
        Bank euBank = new EUBank(2389, "UE", Currency.EUR, 234, 2313, 2,9494949);
        Bank chBank = new ChinaBank(4545, "China", Currency.USD, 2325, 2431, 1, 99999);

        User user1 = new User(1001, "test1", 12200, 40, "GMD", 1500, usBank);
        User user2 = new User(123, "test2", 2323, 49, "company4", 34500, euBank);
        User user3 = new User(876, "test3", 242, 90, "compnay5", 789, chBank);

        UkrainianBankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user1, 150);
        bankSystem.withdraw(user1, 15);

        bankSystem.fund(user2,250);
        bankSystem.fund(user2, 999);

        bankSystem.transferMoney(user1,user2,666);
        bankSystem.transferMoney(user2, user3, 999);

        bankSystem.paySalary(user3);
        bankSystem.paySalary(user2);

        System.out.println(bankSystem.getTransactions());

    }
}
