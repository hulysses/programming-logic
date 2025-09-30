package Exercises;

public class SwimmingTournament {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 11;

        if (age <= 10) {
            System.out.println(name + " competes in the Children's category.");
        } else if (age >= 11 && age <= 15) {
            System.out.println(name + " competes in the Juvenile category.");
        } else if (age >= 16 && age <= 19) {
            System.out.println(name + " competes in the Junior category.");
        } else {
            System.out.println(name + " competes in the Senior category.");
        }
    }
}
