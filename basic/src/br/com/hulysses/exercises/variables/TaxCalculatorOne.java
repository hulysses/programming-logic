package br.com.hulysses.exercises.variables;

public class TaxCalculatorOne {

    public static void main(String[] args) {
        float salary = 2500.00F;
        float taxRate = 0.15F;
        float taxAmount = salary * taxRate;
        System.out.println("Tax Amount: " + taxAmount);
    }
}
