import java.util.Scanner;


public class MadLib {
       
        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
           
            int ageLimit = 18;
                System.out.println("How old are you?\n");

            int userAge = input.nextInt();
            String error = input.nextLine();

                if (userAge < ageLimit){
                    System.out.println("Sorry, For Mature Eyes only. Try Weenie Hut Junior\n");
                 } 

                else {
                System.out.println("What is your name?\n");
                String userName = input.nextLine();
                System.out.println("Give an adverb: \n");
                String adverb = input.nextLine();
                System.out.println("Give an adjective: \n");
                String adjective = input.nextLine();
                System.out.println("Give a noun: \n");
                String nounOne = input.nextLine();
                System.out.println("Give another noun: \n");
                String nounTwo = input.nextLine();
                System.out.println("Give a Number: \n");
                String number = input.nextLine();
                String myName = "Cristian";
                
                System.out.printf("Dear %s, \n", userName);
                System.out.printf("You are %s %s and I want to be your %s! I want to go to the %s with you in %s days.\n", adverb, adjective, nounOne, nounTwo, number);
                System.out.printf("Sincerely %s. \n", myName);
                }

    }
        
}
