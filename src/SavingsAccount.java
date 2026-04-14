public class SavingsAccount extends BankAccount
{
    private double rate = 2.5;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount)
    {
        super(name, amount);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double amount)
    {
        super(oldAccount, amount);
        savingsNumber = oldAccount.savingsNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest()
    {
        double monthlyInterest = getBalance() * (rate / 100 / 12);
        deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber()
    {
        return accountNumber;
    }
}