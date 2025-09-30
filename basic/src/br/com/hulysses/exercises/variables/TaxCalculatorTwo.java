package br.com.hulysses.exercises.variables;

public class TaxCalculatorTwo {

    public static void main(String[] args) {
        float salary = 3500.00F;
        float taxAmount = salary * 0.30F;

        System.out.println("Tax Amount: " + taxAmount);

        taxAmount = salary * 0.15F;
        System.out.println("New Tax Amount: " + taxAmount);

        taxAmount = salary * 0.05F;
        System.out.println("New Tax Amount: " + taxAmount);
    }
}
