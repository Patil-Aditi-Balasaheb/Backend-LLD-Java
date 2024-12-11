package day1_intro_to_oop.class_task;

import java.util.ArrayList;

public class BankAccount {
    private String ownerName;
    private double balance;
    private ArrayList<String> transactionHistory;

    // Non parameterized Constructor
    public BankAccount() {
        this.ownerName = "";
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    // Parameterized Constructor
    public BankAccount(String name, double amount) {
        this.ownerName = name;
        this.balance = amount;
        this.transactionHistory = new ArrayList<>();
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            transactionHistory.add("Deposited: $" + amount);
        } else {
            throw new RuntimeException("Deposit amount must be positive");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if(amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
        } else {
            throw new RuntimeException("Withdraw amount must be positive and less than " + this.balance);
        }
    }

    // Getter method for balance
    public double getBalance() {
        return this.balance;
    }

    // Setter method for balance
    public void setBalance(double amount) {
        if (amount > 0) {
            this.balance = amount;
        } else {
            throw new RuntimeException("Balance amount must be positive");
        }
    }

    // Getter method for ownerName
    public String getOwnerName() {
        return this.ownerName;
    }

    // Setter method for ownerName
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    // Getter method for transactionHistory
    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    // Setter method for transactionHistory
    public void setTransactionHistory(ArrayList<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    // Method to print transaction history
    public void printTransactionHistory() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}