public class BankAccount {
    private double balance;
    private String name; 

    public BankAccount(double b, String n) {
        balance = b;
        name = n;
    }
    
    public void deposit(double amount) { 
        balance+= amount;
    }

    public void withdraw(double amount) {
        balance-= amount;
    }

    public double getBalance() {
        return balance;
    }
    
    public String getName() {
        return name;
    }
}