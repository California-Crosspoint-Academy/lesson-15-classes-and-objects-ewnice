import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial deposit amount: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        BankAccount myAccount = new BankAccount(balance, name);

        myAccount.deposit(505.22);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());
        myAccount.withdraw(100);
        
        System.out.printf("The %s account balance is, $%.2f%n", 
                          myAccount.getName(), myAccount.getBalance());
    }
}