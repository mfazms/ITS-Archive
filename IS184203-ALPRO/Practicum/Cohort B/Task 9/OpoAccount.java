public class OpoAccount {
    private String phoneNumber;
    private String name;
    private double balance=0;
    private int transactions=0;
    private String transactionText = "";
    private int points=0;

    public OpoAccount(String phoneNumber, String name, double balance) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getTransactionCount() {
        return transactions;
    }

    public String getTransactions() {
        return transactionText;
    }
    

    public void topUp(double amount) {
        if (amount >= 0) {
            balance += amount;
            points += ((int)(amount/100)*10);
            transactionText = transactionText + "top up of $" + amount + "\n";
        }
        transactions++;
    }
    
    public int getPoints() {
        return points;
    }

    public void setBalance(double balance) {
        if(balance >= 0){
            this.balance = balance;
        }
    }
    
    public void withdraw(double amount) {
        if(balance - amount >=0){
            balance -= amount;
            transactionText = transactionText + "withdrawal of $" + amount + "\n";
        }
    }
    
    public void setTransaction(String transaction){
        this.transactionText = transaction;
    }


    public void transfer(OpoAccount account, double amount) {
        if(balance - amount >=0) {
        balance -= amount;
        account.setBalance(account.getBalance() + amount);
        transactionText = transactionText + "transfer of $" + amount + " to " + account.getPhoneNumber() + "\n";
        account.setTransaction(account.getTransactions() + "transfer of $" + amount + " from " + phoneNumber + "\n");
        }
    }
}