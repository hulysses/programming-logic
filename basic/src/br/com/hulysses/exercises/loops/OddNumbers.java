package br.com.hulysses.exercises.loops;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        System.out.println("Odd numbers from 1 to " + n + ":");
        while (n >= 1) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
            n--;
        }
    }
}
