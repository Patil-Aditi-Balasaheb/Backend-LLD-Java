package lab.day1_intro_to_oop.class_task;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setOwnerName("Aditi");
        account.setBalance(100.00);

        System.out.println("***********************************\n");
        System.out.println("Account Owner Name: " + account.getOwnerName());
        System.out.println("Account Balance: $" + account.getBalance());

        System.out.println("\n***********************************\n");
        account.deposit(1000.00);
        System.out.println("Balance After Deposit of $1000: $" + account.getBalance());
        account.withdraw(500.00);
        System.out.println("Balance After Withdraw of $500: $" + account.getBalance());
        account.withdraw(40);
        System.out.println("Balance After Withdraw of $40: $" + account.getBalance());
        account.deposit(700);
        System.out.println("Balance After Deposit of $700: $" + account.getBalance());

        System.out.println("\n***********************************\n");
        System.out.println("Transaction History:");
        account.printTransactionHistory();

        System.out.println("\n***********************************\n");
        System.out.println("Current Balance: $" + account.getBalance());
    }
}