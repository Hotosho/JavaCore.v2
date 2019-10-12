package lesson30.task1;

import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class UkrainianBankSystem implements BankSystem {

    private Set<Transaction> transactions = new TreeSet<>();

    @Override
    public void withdraw(User user, int amount) {
        //проверить можно ли снять
        //проверить лимит
        //проверить достатчно ли денег
        // снять деньги

        if (!checkWithdraw(user, amount))
            return;
        double balanceAfterWithdraw = user.getBalance() - amount - amount * user.getBank().getCommission(amount);
        user.setBalance(balanceAfterWithdraw);

        /*Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), new Date(), null, TransactionType.WITHDRAWAL, amount, "sdsdc");
        transactions.add(tr);*/

        createAndSaveTransaction(new Date(), TransactionType.WITHDRAWAL, amount, "sdsdc");
    }


    @Override
    public void fund(User user, int amount) {

        if (!checkFund(user, amount))
            return;
        if (user.getBank().getLimitOfFunding() > amount)
            user.setBalance(user.getBalance() + amount);
        /*Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), new Date(), null, TransactionType.FUNDING, amount, "sdsdc");
        transactions.add(tr);*/
        createAndSaveTransaction(new Date(), TransactionType.FUNDING, amount, "sdsdc");
    }


    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (fromUser.getBank().getCurrency() != toUser.getBank().getCurrency())
            return;

        if (!checkWithdraw(fromUser, amount))
            return;
        if (!checkFund(toUser, amount))
            return;

        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);

        createAndSaveTransaction(new Date(), TransactionType.TRANSFER, amount, "textTransfer");
    }

    @Override
    public void paySalary(User user) {

        if (!checkPaySalary(user))
            return;

        createAndSaveTransaction(new Date(), TransactionType.SALARY_INCOME, user.getSalary(), "textSalary");

    }


    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printWithdrawalErorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + "from user " + user.toString());
    }

    private boolean checkFund(User user, int amount) {
        return user.getBank().getLimitOfFunding() > amount;
    }

    private boolean checkPaySalary(User user){
        if (user.getBank().getLimitOfFunding() > user.getSalary())
            user.setBalance(user.getBalance() + user.getSalary());
        return true;
    }

    private Transaction createAndSaveTransaction(Date dateCreated, TransactionType type, int amount, String descr){
        Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), dateCreated, null, type, amount, descr);
        transactions.add(tr);
        return tr;
    }

    public Set<Transaction> getTransactions(){
        return transactions;
    }
}

