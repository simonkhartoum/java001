import java.util.Scanner;
public class Ifelse {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.printf("please enter your pay please: ");
        int name = scanner.nextInt();
        if(name <= 59){
            System.out.println("Your Grade is B-");
        } else if (name>= 60 && name <= 69 ) {
            System.out.println("Your Grade is B");
        }else if (name>= 70 && name <= 89 ){
            System.out.println("Your Grade is A-");
        }else  {
            System.out.println("Your Grade is A");
        }
    }
}
