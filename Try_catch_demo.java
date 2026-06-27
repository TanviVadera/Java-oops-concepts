/*
Write a small application in Java to develop Banking Application in which user deposits the
amount Rs 1000.00 and then start withdrawing of Rs 400.00, Rs 300.00 and it throws exception
"Not Sufficient Fund" when user withdraws Rs. 500 thereafter.
 */

//custom class
class BalanceAmt extends Exception
{
    public BalanceAmt(String msg)
    {
        super(msg);
    }
}
class bank
{
    double balance=0;
    void deposite(double amount)
    {
        balance+=amount;
    }
    void display()
    {
        System.out.println("Intial balance:"+balance);
    }
}
class withdraw_balance extends bank
{
   void withdraw(double amount) throws BalanceAmt {
       if (amount > balance) {
           throw new BalanceAmt("Not Sufficient Fund");
       }

       balance -= amount;
   }
}
class Try_catch_demo
{
    public static void main(String[] args)
    {
        withdraw_balance w=new withdraw_balance();
        w.deposite(1000);
        w.display();

        try
        {
            w.withdraw(400);
            w.withdraw(300);
            w.withdraw(500);
        }
       catch (BalanceAmt e)
       {
           System.out.println(e.getMessage());
       }
    }
}