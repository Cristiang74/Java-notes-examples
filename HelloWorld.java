/**
 * helloWorld
 */
import java.util.Scanner;

public class HelloWorld {
    
    public static void main(String[] args) {
    // String firstName = "Cristian";
    // System.out.print("Hello, World!!\n");
    // System.out.print("Today is a great day!\n");  
    // System.out.printf("Hello %s!\n", firstName);
    // System.out.printf("Goodbye %s!\n", firstName);
    
    Scanner input = new Scanner(System.in);

      System.out.println("What is your name?");
      String firstName = input.nextLine();
      System.out.printf("What's up %s!\n" , firstName);
      System.out.println("What is your last name?");
      String lastName = input.nextLine();
     System.out.printf("Your last name is %s, eh %s?\n",lastName, firstName);

    
    }
}



