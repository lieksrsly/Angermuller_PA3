package com.company;

public class SavingsAccount {

    static private double annualInterestRate;
    static double savingsBalance;

    public SavingsAccount() {

    }

    public SavingsAccount(double savingBalance) {
        this.savingsBalance = savingBalance;
    }

    public double getSavingBalance() {
        return this.savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthInterest;
        monthInterest = (double)(this.savingsBalance * (annualInterestRate) / 12);
        this.savingsBalance += monthInterest;
    }

    public static void changeInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public static void main(String[] args) {

        int i;
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000.0);
        saver2 = new SavingsAccount(3000.0);


        SavingsAccount.changeInterestRate(0.04);

        for (i = 0; i < 12; ++i) {

            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + " : " + String.format("%.2f", saver1.getSavingBalance()));
        }
    }
}


