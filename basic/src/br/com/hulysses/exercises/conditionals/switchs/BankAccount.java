package br.com.hulysses.exercises.conditionals.switchs;

public class BankAccount {

    public static void main(String[] args) {
        String accountType = "CHECKING";

        switch (accountType) {
            case "SAVINGS":
                System.out.println("0.05% interest rate applied to your Savings Account.");
                break;
            case "CHECKING":
                System.out.println("0.02% interest rate applied to your Checking Account.");
                break;
            case "BUSINESS":
                System.out.println("0.01% interest rate applied to your Business Account.");
                break;
            default:
                System.out.println("Invalid account type selected.");
                break;
        }
    }
}
