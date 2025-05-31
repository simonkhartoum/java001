import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        int marks = scanner.nextInt();

        float percentage = marks / 100.0f;
        System.out.println("Your percentage marks: " + percentage);


        if (marks <= 50) {
            System.out.println("Result: Poor");
        } else if (marks <= 60) {
            System.out.println("Result: Average");
        } else if (marks <= 70) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Excellent");
        }
    }
}

