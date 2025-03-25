import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName = new Scanner(System.in).nextLine();

        int groupNumber;
        do{
            System.out.println("Enter your Group Number");
            groupNumber = keyboard.nextInt();
        }while(groupNumber < 1 || groupNumber > 3);

        System.out.println("Welcome " + firstName + " from G" + groupNumber + " to theObject-Oriented Development Class !!");
    }
}