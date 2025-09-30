import java.util.Scanner;

public class Main {

    // Entry point of the program
    public static void main(String[] args) {

        // Class 01
        System.out.println("Hello World!");

        // Class 02
        int age = 19;
        System.out.println("Age: " + age);

        // Class 03
        double height = 1.75;
        System.out.println("Height: " + height);

        float weight = 70.5F;
        System.out.println("Weight: " + weight);

        // Class 04
        char sex = 'M';
        System.out.println("Sex: " + sex);

        String name = "John Doe";
        System.out.println("Name: " + name);

        // Class 05
        boolean isEmployed = true;
        System.out.println("Is Employed: " + isEmployed);

        // Class 06
        if (age > 18) {
            System.out.println(name + " is an adult.");
        }

        if (isEmployed) {
            System.out.println(name + " is employed.");
        } else {
            System.out.println(name + " is not employed.");
        }

        // Class 07
        if (isEmployed && age < 18) {
            System.out.println(name + " is a minor and employed.");
        }

        if (isEmployed || age < 18) {
            System.out.println(name + " is a minor and employed.");
        }


        // Class 08
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        // Class 09
    }
}