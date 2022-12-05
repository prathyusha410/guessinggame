import java.util.*;
public class Guessinggame{
    public static void main(String[] args){
        int userNumber;
        int randomNumber;
        char playGame = 'y';
        Scanner sc = new Scanner(System.in); 
while (playGame == 'y') {
    int chance=0;
    int guesses = 0;
    System.out.println("you have 3 chances to guess a number");
    System.out.println("***************************************************");
        if (playGame != 'y'){
            break;}
        Random number = new Random();
        randomNumber = number.nextInt(100);
        int correct = 0;
        while (correct == 0 && chance<3){
            System.out.println("Please pick a number between 1 and 100.");
            System.out.println("***************************************************");
            userNumber = sc.nextInt();
            if (userNumber > randomNumber)
                System.out.println("Number is high, try something low.");
            if (userNumber < randomNumber)
                System.out.println("Number is low, try something high.");
            if (userNumber == randomNumber) {
                System.out.println("That number is correct!");
                correct = 1;
                break;
            } 
            System.out.println("***************************************************");           
            guesses++;
            if(correct==1){
            System.out.println("You have guessed " + guesses + " chances!");
            
                   }
                   else{
                    System.out.println("Didn't guessed the correct number,Play Again!");
                   }   
                   System.out.println("***************************************************");
                   chance++;    
                }
                System.out.println("Would you like to play again? y/n");
                playGame = sc.next().charAt(0);
    }
}
}
