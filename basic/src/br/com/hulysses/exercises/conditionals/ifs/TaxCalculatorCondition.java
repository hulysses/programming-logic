package br.com.hulysses.exercises.conditionals.ifs;

public class TaxCalculatorCondition {

    public static void main(String[] args) {
        float salary = 2000.50F;
        float taxAmount;

        if (salary > 3000) {
            taxAmount = salary * 0.30F;
        } else if (salary > 2000) {
            taxAmount = salary * 0.15F;
        } else {
            taxAmount = salary * 0.05F;
        }

        System.out.println("Tax Amount: " + taxAmount);
    }
}
