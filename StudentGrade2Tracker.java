import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade2Tracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("Enter student grades (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double grade = Double.parseDouble(input);
                grades.add(grade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric grade.");
            }
        }
        
        if (grades.size() == 0) {
            System.out.println("No grades entered.");
            return;
        }

        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        
        for (double grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = total / grades.size();

        System.out.println("Grades Summary:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
