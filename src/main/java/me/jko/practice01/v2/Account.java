package me.jko.practice01.v2;

public class Account {
    private final String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }
}
