class BankAccount 
{
    private String id;
    private double balance;
    private int transactions;
    public BankAccount(String id)
    {
        this.id = id;
        this.balance = 0;
        this.transactions = 0;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public String getID()
    {
        return this.id;
    }
    public int getTransactions() 
    {
        return this.transactions;
    }
    public void deposit(double amount)
    {
        if(amount >= 0 && amount <= 500)
        {
            this.balance += amount;
            transactions++;
        }
    }
    public void withdraw(double amount)
    {
        if(this.balance >= amount)
        {
            this.balance -= amount;
            transactions++;
        }
    }
    public void transactionFee(double amount)
    {
        int fee = 0;
        for(int idx = 1; idx <= transactions; idx++)
        {
            fee += (amount*idx);
        }
        this.balance -= fee;
        if(getBalance() - fee > 0) 
            System.out.println("true");
        else
            System.out.println("false");
    }
}

public class OOP001 {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");

        savings.deposit(10.00); //1st transaction

        savings.deposit(50.00); // 2nd transaction

        savings.deposit(10.00); //3rd transaction

        savings.deposit(70.00);  //4th transaction

        // System.out.println(savings.getBalance());
        savings.transactionFee(5.00);
        savings.transactionFee(10.00);
    }
}