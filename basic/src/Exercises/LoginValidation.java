package Exercises;

import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.isBlank()) {
            System.out.println("Invalid name");
        } else {
            System.out.println("Welcome " + name);
        }
    }
}
