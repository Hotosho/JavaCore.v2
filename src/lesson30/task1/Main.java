package lesson30.task1;

public class Main {

    public static void main(String[] args) {
        Bank usBank = new USBank(1222, "USA", Currency.USD, 100, 1400, 4, 444343434);
        Bank euBank = new EUBank(2389, "UE", Currency.EUR, 234, 2313, 2,949494949);
        Bank chBank = new ChinaBank(4545, "China", Currency.USD, 2325, 2431, 1, 99999999);


        User user1 = new User(1001, "Denis", 12200, 40, "GMD", 1500, usBank);
        User user2 = new User(34, "test2", 353, 40,"company2",4454, usBank);

        User user3 = new User(243, "test3", 1323, 23, "compnay3", 3000, euBank);
        User user4 = new User(123, "test4", 2323, 49, "company4", 34500, euBank);

        User user5 = new User(876, "test5", 242, 90, "compnay5", 789, chBank);
        User user6 = new User(56, "test6", 3456, 45, "company6", 234, chBank);

        BankSystem bankSystem = new UkrainianBankSystem();

        bankSystem.withdraw(user1, 150);
        System.out.println(user1.getBalance());

        bankSystem.fund(user3, 5000);
        System.out.println(user3.getBalance());

        bankSystem.transferMoney(user2, user5, 9000);
        System.out.println(user2.getBalance());
        System.out.println(user5.getBalance());
    }
}
