import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);  // Create Scanner object

       System.out.print("Enter your name: ");
       String name = scanner.nextLine();  // Read user input as a string
       System.out.print("Enter your age please: ");
       int age = scanner.nextInt();  // Read user input as an integer
       System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        
    }
}
