import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int lowerbound = 1;
        int upperbound = 100;

        int numbertoguess = random.nextInt( 100);

        int attempts = 0;
        int maxAttempts = 10;
         System.out.println("Welcome to a number guessing game");
         System.out.println("You have select a number between "+lowerbound+" and "+upperbound+" \nCan you guess it !");

         while (attempts < maxAttempts) {
            System.out.println("Enter your guess number : ");
            int userguess = sc.nextInt();
            attempts++;

            if(userguess == numbertoguess){
                System.out.println("Congrats Your guess is Correct in "+attempts+" attempts");
                break;
            }

            else if (userguess < numbertoguess) {
                System.out.println("Please try a higher number : ");
                
            }
            else{
                System.out.println("Please try lower number : ");
            }
            
           }
         if(attempts == maxAttempts){
            System.out.println("Sorry you have a reach a maximum numbers of attempts.\n The correct number is : "+numbertoguess);
           }
         System.out.println("Thanks to playing");
         sc.close();


    }
}
