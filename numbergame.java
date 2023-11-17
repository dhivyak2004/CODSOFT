import java.util.*;

public class numbergame{

    int targetNumber,i;
    public static void main(String[]args){

        Random rand=new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        boolean PlayAgain=true;
        
    while(PlayAgain){

            int targetNumber=rand.nextInt(100)+1;

            System.out.println("I have selected a numberber between 1 and 100.can you guess it?");

        while(true){

          for(int i=0;i<11;i++){

             Scanner scan1=new Scanner(System.in);

             System.out.println("Enter your Guess : ");

             int guessNumber=scan1.nextInt();

             if(targetNumber==guessNumber){

                System.out.println("Congragulation !!.your guess is Correct");

                break;

             }
             else if(guessNumber<targetNumber){

                System.out.println("Too low ! Try Again .");

             }
             else {

                System.out.println("Too high ! Try Again .");

             }
             if( i>=10){

                System.out.println("Sorry! you have reached So many attempts.The Correct number is "+ " " +targetNumber);

                break;

             }
           
           }
           
        System.out.print ("Do you Want to PlayAgain ?(Yes/no) :");

        Scanner scan =new Scanner(System.in);

        String PlayAgainInput=scan.next().toLowerCase();

        PlayAgain=PlayAgainInput.equals("yes");  
        
        }
       
    }
   
 }


}